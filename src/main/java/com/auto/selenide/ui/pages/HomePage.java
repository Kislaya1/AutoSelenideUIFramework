package com.auto.selenide.ui.pages;

import static com.auto.selenide.ui.enums.LeftMenuOptions.PIM;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.auto.selenide.ui.pages.components.LeftMenuComponent;
import com.codeborne.selenide.SelenideElement;

public class HomePage {
    private static final SelenideElement PROFILE_ICON = $(byXpath(".//img[contains(@class,'userdropdown')]"));
    private final LeftMenuComponent leftMenuComponent;

    public HomePage() {
        this.leftMenuComponent = new LeftMenuComponent();
    }

    public AddEmployeePage navigateToPimPage() {
        PROFILE_ICON.shouldBe(visible);
        leftMenuComponent.selectAMenuFromLeftMenuBar(PIM);
        return new AddEmployeePage();
    }
}
