package com.vp.vivapulse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vp.vivapulse.repository.UserRepository;

@RestController
@RequestMapping("/api/me")
@CrossOrigin(origins = "http://localhost:5173") // Para permitir solicitudes desde React

public class AboutMeController {
    
    @Autowired
    private final UserRepository userRepository;

    public AboutMeController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public ResponseEntity<java.util.Map<String, Object>> sayHello(@AuthenticationPrincipal UserDetails userDetails) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String email = authentication.getName();
        Long id = userRepository.findByEmail(email)
                .map(user -> user.getId())
                .orElse(null);
        String firstName = userRepository.findByEmail(email)
                .map(user -> user.getFirstName())
                .orElse("Unknown");
        String lastName = userRepository.findByEmail(email)
                .map(user -> user.getLastName())
                .orElse("Unknown");

        return ResponseEntity.ok().body(
            java.util.Map.of(
                "id", id,
                "email", email,
                "firstName", firstName,
                "lastName", lastName
            )
        );
    }

}
