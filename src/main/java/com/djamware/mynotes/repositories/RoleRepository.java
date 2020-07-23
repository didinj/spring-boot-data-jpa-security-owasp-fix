package com.djamware.mynotes.repositories;

import com.djamware.mynotes.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RoleRepository extends JpaRepository<Role, Long> {

    @Query("SELECT r FROM Role r WHERE r.role = :role")
    Role findByRole(@Param("role") String role);
}
