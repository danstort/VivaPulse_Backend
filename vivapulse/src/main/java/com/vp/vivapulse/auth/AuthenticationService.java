package com.vp.vivapulse.auth;

import java.time.LocalDateTime;


import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.vp.vivapulse.config.JwtService;
import com.vp.vivapulse.model.User;
import com.vp.vivapulse.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository repository;

    private final PasswordEncoder passwordEncoder; //Se utiliza para encriptar la contraseña al registrar un usuario.

    private final JwtService jwtService; //Se utiliza para generar el token al autenticar un usuario.
    
    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse register (RegisterRequest request) {
        var user = User.builder()
        .firstName(request.getFirstName())
        .lastName(request.getLastName())
        .email(request.getEmail())
        .password(passwordEncoder.encode(request.getPassword()))
        .createdAt(LocalDateTime.now())
        .isAdmin(false)
        .build();

        repository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(
            request.getEmail(),
            request.getPassword()
        )
    );
    var user = repository.findByEmail(request.getEmail())
        .orElseThrow();
    var jwtToken = jwtService.generateToken(user);
    //var refreshToken = jwtService.generateRefreshToken(user);
    // revokeAllUserTokens(user);
    // saveUserToken(user, jwtToken);
    return AuthenticationResponse.builder()
        .token(jwtToken)
        .build();
    }

}
