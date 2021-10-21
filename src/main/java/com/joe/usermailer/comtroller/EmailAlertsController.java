package com.joe.usermailer.comtroller;

import com.joe.usermailer.model.EmailAlerts;
import com.joe.usermailer.repo.EmailAlertsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmailAlertsController {
    @Autowired
    EmailAlertsRepo emailAlertsRepo;

    @GetMapping("/check")
    public ResponseEntity<String> checkAlive() {
            return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<EmailAlerts> createTutorial(@RequestBody EmailAlerts emailAlerts) {
        try {
            EmailAlerts _emailAlerts = emailAlertsRepo
                    .save(formatEmailAlert(emailAlerts));
            return new ResponseEntity<>(_emailAlerts, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private EmailAlerts formatEmailAlert(EmailAlerts emailAlerts) {
        EmailAlerts emailAlertsClone= new EmailAlerts();
        emailAlertsClone.setToAddress(emailAlerts.getToAddress());
        emailAlertsClone.setEmailSent(false);
        emailAlertsClone.setMailBody(emailAlerts.getMailBody());
        emailAlertsClone.setMailSubject(emailAlerts.getMailSubject());
        return emailAlertsClone;
    }

}
