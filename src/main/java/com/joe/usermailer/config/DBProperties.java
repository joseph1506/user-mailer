package com.joe.usermailer.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.datasource")
@Getter
@Setter
@ToString
public class DBProperties {
    private String url;
    private String username;
    private String password;
    private String driverClassName;
}
