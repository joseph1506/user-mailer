package com.joe.usermailer.repo;

import com.joe.usermailer.model.EmailAlerts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailAlertsRepo extends JpaRepository<EmailAlerts, Long> {
}
