package com.auto.selenide.ui.pages.components;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

import com.auto.selenide.ui.enums.PIMPageNavOptions;

public class PIMPageNavComponent {
    public PIMPageNavComponent() {}

    public PIMPageNavComponent selectNavOptionFromPIMPage(final PIMPageNavOptions pimPageNavOptions) {
        $(byText(pimPageNavOptions.getNavOptions())).shouldBe(visible).click();
        return this;
    }
}
