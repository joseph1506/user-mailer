package com.joe.usermailer.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Table(name = "EmailAlerts")
public class EmailAlerts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "ToAddress")
    private String toAddress;

    @Column(name = "MailSubject")
    private String mailSubject;

    @Column(name = "MailBody")
    private String mailBody;

    @Column(name = "EmailSent")
    private boolean emailSent;
}
