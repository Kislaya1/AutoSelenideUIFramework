package com.auto.selenide.ui.pages.components;

import com.auto.selenide.ui.enums.LeftMenuOptions;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LeftMenuComponent {
    private static final SelenideElement SEARCH_BOX = $(byAttribute("placeholder", "Search"));

    public LeftMenuComponent() {
    }

    public LeftMenuComponent selectAMenuFromLeftMenuBar(final LeftMenuOptions leftMenuOptions) {
        $(byText(leftMenuOptions.getName())).shouldBe(enabled)
                .click();
        return this;
    }

    public LeftMenuComponent userSearchMenuOptions(final LeftMenuOptions leftMenuOptions) {
        SEARCH_BOX.shouldBe(visible).setValue(leftMenuOptions.getName());
        $(byText(leftMenuOptions.getName())).shouldBe(enabled).click();
        return this;
    }
}
