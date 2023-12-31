package com.auto.selenide.ui.tests.web;

import com.auto.selenide.ui.entity.EmployeeDetails;
import com.auto.selenide.ui.pages.LoginPage;
import com.auto.selenide.ui.testdata.EmployeeTestData;
import com.auto.selenide.ui.tests.base.WebTestSetup;
import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

class AddNewEmployeeTests extends WebTestSetup {

    @ParameterizedTest
    @ArgumentsSource(EmployeeTestData.class)
    @ExtendWith({TextReportExtension.class})
    void userAddNewEmployee(final EmployeeDetails employeeDetails) {
        LoginPage.getInstance()
                .loginToApplication()
                .navigateToPimPage()
                .addNewEmployee(employeeDetails)
                .verifyEmployeeSuccessfullyCreated();
    }
}
