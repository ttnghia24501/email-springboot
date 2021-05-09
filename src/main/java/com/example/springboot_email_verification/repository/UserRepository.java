package com.example.springboot_email_verification.repository;

import com.example.springboot_email_verification.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface UserRepository extends JpaRepository<User, String> {
    List<User> findByEmail(String email);
}
