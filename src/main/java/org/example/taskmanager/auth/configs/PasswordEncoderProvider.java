package org.example.taskmanager.auth.configs;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author batal
 * @Date 12.02.2025
 */
public interface PasswordEncoderProvider {
    PasswordEncoder passwordEncoder();
}

