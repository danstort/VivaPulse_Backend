package com.vp.vivapulse.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    private String apiToken ="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";
    

    private final RestTemplate restTemplate;

    @Autowired
    public ChatController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
  
    @PostMapping
    public ResponseEntity<Map<String, String>> chat(@RequestBody Map<String, Object> request) {
        String userMessage = (String) request.get("message");

        List<Map<String, String>> messages = new ArrayList<>();
        Map<String, String> systemMsg = new HashMap<>();
        systemMsg.put("role", "system");
        systemMsg.put("content", "Eres un asistente de IA especializado en el ámbito de la salud, ofreciendo información y apoyo.");
        messages.add(systemMsg);

        Map<String, String> userMsg = new HashMap<>();
        userMsg.put("role", "user");
        userMsg.put("content", userMessage);
        messages.add(userMsg);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + apiToken);
        headers.set("HTTP-Referer", "http://localhost:5173");

        Map<String, Object> body = new HashMap<>();
        body.put("model", "deepseek/deepseek-r1-0528-qwen3-8b:free");
        body.put("messages", messages);
        body.put("max_tokens", 500);
        body.put("temperature", 0.7);

        // Imprime el body para depuración
        try {
            System.out.println("BODY: " + new ObjectMapper().writeValueAsString(body));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(body, headers);

        try {
            ResponseEntity<String> response = restTemplate.postForEntity(
                    "https://openrouter.ai/api/v1/chat/completions",
                    entity,
                    String.class);

            System.out.println("Respuesta de OpenRouter: " + response.getBody());
            System.out.println("API TOKEN: " + apiToken);

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