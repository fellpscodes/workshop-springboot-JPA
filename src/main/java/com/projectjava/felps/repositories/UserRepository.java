package com.projectjava.felps.repositories;

import com.projectjava.felps.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
