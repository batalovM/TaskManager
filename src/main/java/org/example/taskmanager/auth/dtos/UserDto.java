package org.example.taskmanager.auth.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author batal
 * @Date 12.02.2025
 */
@Data
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String username;
    private String email;

}
