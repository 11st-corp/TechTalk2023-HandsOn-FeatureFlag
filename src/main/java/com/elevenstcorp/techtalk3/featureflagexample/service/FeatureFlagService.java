package com.elevenstcorp.techtalk3.featureflagexample.service;

public interface FeatureFlagService {
    boolean getFeatureExists();
    String getHeaderColorByEmail(String email);
}
