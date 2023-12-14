package com.elevenstcorp.techtalk3.featureflagexample.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("flagd")
public record FlagdProperties(String host, int port, boolean tls) {
}
