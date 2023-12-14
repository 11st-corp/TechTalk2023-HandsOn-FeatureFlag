package com.elevenstcorp.techtalk3.featureflagexample.config;

import dev.openfeature.contrib.providers.flagd.FlagdOptions;
import dev.openfeature.contrib.providers.flagd.FlagdProvider;
import dev.openfeature.sdk.Client;
import dev.openfeature.sdk.FeatureProvider;
import dev.openfeature.sdk.OpenFeatureAPI;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(FlagdProperties.class)
public class FeatureFlagConfiguration {

    @Bean
    public Client openFeatureClient(final FlagdProperties properties) {
        final var apiInstance = OpenFeatureAPI.getInstance();
        apiInstance.setProvider(pluggableFlagdProvider(properties));

        /**
         * Client 생성 - name을 지정하여 multi-client 또한 사용 가능 {@link OpenFeatureAPI#getClient(String)}
         */
        return apiInstance.getClient();
    }

    private FeatureProvider pluggableFlagdProvider(final FlagdProperties properties) {
        return new FlagdProvider(FlagdOptions.builder()
            .host(properties.host())
            .port(properties.port())
            .tls(properties.tls())
            .build());
    }
}
