package com.auto.selenide.ui.tests.base;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public class TestSetup {
    @BeforeAll
    public static void setUpClass() {
        FixtureFactoryLoader.loadTemplates("com.auto.selenide.ui.templates");

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(false)
                .savePageSource(true)
        );
    }
}
