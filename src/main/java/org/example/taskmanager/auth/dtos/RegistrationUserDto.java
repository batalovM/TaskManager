package org.example.taskmanager.auth.dtos;

import lombok.Data;

/**
 * @author batal
 * @Date 12.02.2025
 */
@Data
public class RegistrationUserDto {

    private String username;
    private String password;
    private String confirmPassword;
    private String email;

}
