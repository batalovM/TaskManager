package org.example.taskmanager.auth.repo;

import org.example.taskmanager.auth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author batal
 * @Date 10.02.2025
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByEmail(String email);
}

