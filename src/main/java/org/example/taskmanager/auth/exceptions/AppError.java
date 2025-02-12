package org.example.taskmanager.auth.exceptions;

import lombok.Data;

import java.util.Date;

/**
 * @author batal
 * @Date 12.02.2025
 */
@Data
public class AppError {
    private int status;
    private String message;
    private Date timestamp;
    public AppError(int status, String message) {
        this.status = status;
        this.message = message;
        this.timestamp = new Date();
    }
}
