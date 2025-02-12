package org.example.taskmanager.auth.dtos;

import lombok.Data;

/**
 * @author batal
 * @Date 12.02.2025
 */
@Data
public class JwtRequest {
    private String username;
    private String password;
}
