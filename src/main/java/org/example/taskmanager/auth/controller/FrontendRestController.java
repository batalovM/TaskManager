package org.example.taskmanager.auth.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;

@RestController
public class FrontendRestController {

    @GetMapping("/")
    public ResponseEntity<String> getHomePage() throws IOException {
        // Загружаем HTML файл как строку
        ClassPathResource resource = new ClassPathResource("static/login.html");
        String content = new String(Files.readAllBytes(resource.getFile().toPath()));
        return ResponseEntity.ok(content);
    }
}
