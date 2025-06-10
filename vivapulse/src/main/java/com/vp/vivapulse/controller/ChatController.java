package com.vp.vivapulse.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @Value("${openrouter.api.token}")
    private String apiToken;

    private final RestTemplate restTemplate;

    @Autowired
    public ChatController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> chat(@RequestBody Map<String, Object> request) {
        String userMessage = (String) request.get("message");

        List<Map<String, String>> messages = new ArrayList<>();
        messages.add(Map.of("role", "system", "content",
                "Eres un asistente de IA especializado en el ámbito de la salud, ofreciendo información y apoyo."));
        messages.add(Map.of("role", "user", "content", userMessage));

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + apiToken); 
        headers.set("HTTP-Referer", "https://vivapulsefront.vercel.app"); 

        // Primero, construye la lista de mensajes
        // Luego, usa esa lista al construir el body del Map
        Map<String, Object> body = Map.of(
                "model", "openai/gpt-3.5-turbo",
                "messages", messages, // Aquí pasamos la lista de mensajes que creamos
                "max_tokens", 500,
                "temperature", 0.7);

        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(body, headers);

        try {
            ResponseEntity<String> response = restTemplate.postForEntity(
                    "https://openrouter.ai/api/v1/chat/completions",
                    entity,
                    String.class);

            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(response.getBody());
            String assistantMessage = root
                    .path("choices")
                    .get(0)
                    .path("message")
                    .path("content")
                    .asText();

            Map<String, String> result = new HashMap<>();
            result.put("reply", assistantMessage);
            return ResponseEntity.ok(result);

        } catch (Exception e) {
            e.printStackTrace();
            Map<String, String> error = new HashMap<>();
            error.put("error", "No se pudo obtener respuesta del modelo.");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
        }
    }
}