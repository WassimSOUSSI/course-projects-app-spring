package com.wassim.springsecurityexample.repositories;

import com.wassim.springsecurityexample.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
