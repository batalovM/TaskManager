package org.example.taskmanager.auth.controller;

import org.example.taskmanager.auth.model.User;
import org.example.taskmanager.auth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author batal
 * @Date 11.02.2025
 */
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService service;

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody User user){
        String token = service.verify(user);
        if ("fail".equals(token)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("message", "Invalid credentials"));
        }
        return ResponseEntity.ok(Map.of("token", token));
    }
}
