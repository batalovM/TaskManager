package org.example.taskmanager.auth.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author batal
 * @Date 12.02.2025
 */
@Data
@AllArgsConstructor
public class JwtResponse {
    public String token;
}
