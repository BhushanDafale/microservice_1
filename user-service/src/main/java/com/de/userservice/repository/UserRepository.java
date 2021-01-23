package com.de.userservice.repository;

import com.de.userservice.entiry.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
