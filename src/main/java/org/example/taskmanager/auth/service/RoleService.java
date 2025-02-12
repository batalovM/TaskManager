package org.example.taskmanager.auth.service;

import lombok.RequiredArgsConstructor;
import org.example.taskmanager.auth.entities.Role;
import org.example.taskmanager.auth.repositories.RoleRepository;
import org.springframework.stereotype.Service;

/**
 * @author batal
 * @Date 12.02.2025
 */
@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;

    public Role getUserRole() {
        return roleRepository.findByName("ROLE_USER").get();
    }
}
