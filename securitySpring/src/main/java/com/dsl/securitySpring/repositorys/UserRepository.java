package com.dsl.securitySpring.repositorys;

import com.dsl.securitySpring.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {



}
