package com.elevenstcorp.techtalk3.featureflagexample.service;

import java.util.Map;

import dev.openfeature.sdk.Client;
import dev.openfeature.sdk.ImmutableContext;
import dev.openfeature.sdk.Value;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FeatureFlagServiceImpl implements FeatureFlagService {

    private final Client openFeatureClient;

    @Override
    public boolean getFeatureExists() {
        final var flagKey = "myBoolFlag";
        final var defaultIfKeyNotExists = false;

        return openFeatureClient.getBooleanValue(flagKey, defaultIfKeyNotExists);
    }

    @Override
    public String getHeaderColorByEmail(final String email) {
        final var flagKey = "headerColor";
        final var defaultIfKeyNotExists = "red";
        final var evaluationContextContainsEmail = new ImmutableContext(Map.of("email", new Value(email)));

        return openFeatureClient.getStringValue(flagKey, defaultIfKeyNotExists, evaluationContextContainsEmail);
    }

}
