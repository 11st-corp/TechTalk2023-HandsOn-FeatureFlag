package com.elevenstcorp.techtalk3.featureflagexample.controller;

import com.elevenstcorp.techtalk3.featureflagexample.service.FeatureFlagService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flags")
@RequiredArgsConstructor
public class FeatureFlagSampleController {

    private final FeatureFlagService featureFlagService;

    @GetMapping("/boolean")
    public boolean myBoolFlag() {
        /**
         * 애플리케이션을 종료하지 마시고,
         * /src/main/resources/flags.yaml의
         * `flags.myBoolFlag.defaultVariant` 값을 변경해 변화를 확인해보세요.
         */
        return featureFlagService.getFeatureExists();
    }

    @GetMapping("/headerColorByEmail")
    public String headerColor(@RequestParam String email) {
        /**
         * QueryString으로 email 정보를 보내주세요.
         * email 도메인이 @faas.com인 경우
         * red/blue/green/yellow가 각 25%씩 랜덤하게 반환횝니다.
         * Targeting Rule (Fractional) 을 만족하지 않으면 기본값 red가 반환됩니다.
         */
        return featureFlagService.getHeaderColorByEmail(email);
    }

}
