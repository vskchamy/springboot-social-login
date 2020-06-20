package com.vsk.sociallogin.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "app")
@Data
public class ApplicationProperties {
    private String tokenSecret;
    private long tokenExpirationMilliSec;
    private List<String> authorizedRedirectUris;
}
