package com.auto.selenide.ui.pages;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

import com.auto.selenide.ui.entity.LoginDetails;
import com.codeborne.selenide.SelenideElement;
import java.util.Objects;

public class LoginPage {
    private static final SelenideElement USERNAME = $(byName("username"));
    private static final SelenideElement PASSWORD = $(byName("password"));
    private static final SelenideElement LOGIN_BUTTON = $("[type='submit']");
    private static LoginPage loginPage;
    private LoginPage() {}

    public static synchronized LoginPage getInstance() {
        if ( Objects.isNull(loginPage))
            loginPage = new LoginPage();
        return loginPage;
    }
    public HomePage loginToApplication(final LoginDetails loginDetails) {
        USERNAME.shouldBe(visible).setValue(loginDetails.getUsername());
        PASSWORD.shouldBe(visible).setValue(loginDetails.getPassword());
        LOGIN_BUTTON.shouldBe(visible).click();
        return new HomePage();
    }
}
