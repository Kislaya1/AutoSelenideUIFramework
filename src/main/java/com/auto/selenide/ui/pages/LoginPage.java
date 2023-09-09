package com.auto.selenide.ui.pages;

import com.auto.selenide.ui.config.IEnvConfig;
import com.codeborne.selenide.SelenideElement;
import org.aeonbits.owner.ConfigFactory;

import java.util.Objects;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static final IEnvConfig config = ConfigFactory.create(IEnvConfig.class);
    private static final SelenideElement USERNAME = $(byName("username"));
    private static final SelenideElement PASSWORD = $(byName("password"));
    private static final SelenideElement LOGIN_BUTTON = $("[type='submit']");
    private static LoginPage loginPage;

    private LoginPage() {
    }

    public static synchronized LoginPage getInstance() {
        if (Objects.isNull(loginPage))
            loginPage = new LoginPage();
        return loginPage;
    }

    public HomePage loginToApplication() {
        USERNAME.shouldBe(visible).setValue(config.username());
        PASSWORD.shouldBe(visible).setValue(config.password());
        LOGIN_BUTTON.shouldBe(visible).click();
        return new HomePage();
    }
}
