package com.Ecome.demo.repositories;

import com.Ecome.demo.model.AppRole;
import com.Ecome.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
