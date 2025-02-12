package org.example.taskmanager.auth.repositories;

import org.example.taskmanager.auth.entities.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author batal
 * @Date 12.02.2025
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
    Optional<Role> findByName(String name);
}
