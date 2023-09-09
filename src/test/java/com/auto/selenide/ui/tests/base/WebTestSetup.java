package com.auto.selenide.ui.tests.base;

import com.auto.selenide.ui.config.IEnvConfig;
import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class WebTestSetup extends TestSetup {
    private static final IEnvConfig config = ConfigFactory.create(IEnvConfig.class);

    @BeforeEach
    void setUp() {
        Configuration.headless = false;
        open(config.webUrl());
    }
}
