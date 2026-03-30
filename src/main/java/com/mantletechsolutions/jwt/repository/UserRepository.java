package com.mantletechsolutions.jwt.repository;

import com.mantletechsolutions.jwt.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, long> {

    Optional<UserEntity> findByEmail(String email);
    Boolean existsByEmail(String email);
}
