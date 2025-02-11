package org.example.taskmanager.auth.service;

import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;
import io.jsonwebtoken.Jwts;



/**
 * @author batal
 * @Date 10.02.2025
 */

@Service
public class JWTService {

    private static final String SECRET_KEY = "4f8c1b2a3e5d6f7g8h9i0j1k2l3m4n5o6p7q8r9s0t1u2v3w4x5y6z7a8b9c0d1";  // Используй свой секретный ключ для подписи

    // Генерация JWT токена
    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)  // Подписываем токен
                .compact();
    }

    // Извлечение имени пользователя из токена
    public String extractUsername(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET_KEY).build()  // Используем тот же ключ для проверки
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    // Проверка валидности токена
    public boolean isTokenValid(String token) {
        try {
            Jwts.parser()
                    .setSigningKey(SECRET_KEY).build()  // Проверка с тем же ключом
                    .parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;  // Если ошибка — токен невалидный
        }
    }
}
