package com.example.springboot_email_verification.repository;

import com.example.springboot_email_verification.model.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface VerificationTokenRepository extends JpaRepository<VerificationToken,String> {
    List<VerificationToken> findByUserEmail(String email);
    List<VerificationToken> findByToken(String token);
}
