package com.auto.selenide.ui.pages;

import com.auto.selenide.ui.pages.components.LeftMenuComponent;
import com.codeborne.selenide.SelenideElement;

import static com.auto.selenide.ui.enums.LeftMenuOptions.PIM;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private static final SelenideElement PROFILE_ICON = $(byXpath(".//img[contains(@class,'userdropdown')]"));
    private final LeftMenuComponent leftMenuComponent;

    public HomePage() {
        this.leftMenuComponent = new LeftMenuComponent();
    }

    public PIMPage navigateToPimPage() {
        PROFILE_ICON.shouldBe(visible);
        leftMenuComponent.selectAMenuFromLeftMenuBar(PIM);
        return new PIMPage();
    }
}
