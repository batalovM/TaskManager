package org.example.taskmanager.auth.entities;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author batal
 * @Date 12.02.2025
 */
@Entity
@Data
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

}
