package org.example.taskmanager.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;


/**
 * @author batal
 * @Date 10.02.2025
 */
@RestController
@RequestMapping("/api")
public class ProtectedController {

    @GetMapping("/protected")
    public ResponseEntity<?> getProtectedData(Authentication authentication) {
        return ResponseEntity.ok(Collections.singletonMap("message", "Это защищенные данные! Пользователь: " + authentication.getName()));
    }
}

