package com.auto.selenide.ui.pages;

import static com.auto.selenide.ui.enums.FileLocations.EMPLOYEE_PROFILE_IMAGE;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import com.auto.selenide.ui.entity.EmployeeDetails;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

public class PIMPage {

    private static final SelenideElement ADD_EMPLOYEE_BUTTON = $(withText("Add Employee"));
    private static final SelenideElement FIRST_NAME = $(byName("firstName"));
    private static final SelenideElement MIDDLE_NAME = $(byName("middleName"));
    private static final SelenideElement LAST_NAME = $(byName("lastName"));
    private static final SelenideElement EMPLOYEE_ID = $(byXpath(".//label[text()='Employee Id']/parent::div/parent::div/div/input"));
    private static final SelenideElement IMAGE_BUTTON = $(byXpath("//input[@type='file']"));
    private static final SelenideElement SUBMIT_BUTTON = $(withText("Save"));
    private static final ElementsCollection SUCCESS_MSG = $$(withText("Success"));

    public PIMPage addNewEmployee(final EmployeeDetails employeeDetails) {
        ADD_EMPLOYEE_BUTTON.shouldBe(enabled).click();
        FIRST_NAME.shouldBe(visible).setValue(employeeDetails.getFirstName());
        MIDDLE_NAME.shouldBe(visible).setValue(employeeDetails.getMiddleName());
        LAST_NAME.shouldBe(visible).setValue(employeeDetails.getLastName());
        EMPLOYEE_ID.shouldBe(visible).clear();
        EMPLOYEE_ID.shouldBe(visible).setValue(Integer.toString(employeeDetails.getEmployeeId()));
        IMAGE_BUTTON.shouldBe(enabled).uploadFromClasspath(EMPLOYEE_PROFILE_IMAGE.getLocation());
        SUBMIT_BUTTON.shouldBe(visible).click();
        return this;
    }

    public void verifyEmployeeSuccessfullyCreated() {
        SUCCESS_MSG.first().shouldBe(visible);
    }
}
