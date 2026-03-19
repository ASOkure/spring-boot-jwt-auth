package com.mantletechsolutions.jwt.entity;

import com.mantletechsolutions.jwt.constant.ERole;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class RoleEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column
    private ERole name;

}
