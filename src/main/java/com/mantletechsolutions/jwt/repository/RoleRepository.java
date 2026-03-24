package com.mantletechsolutions.jwt.repository;

import com.mantletechsolutions.jwt.constant.ERole;
import com.mantletechsolutions.jwt.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
   Optional<RoleEntity> findByName(ERole name);
}




