package com.wassim.springsecurityexample.repositories;

import com.wassim.springsecurityexample.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Roles,String> {
}
