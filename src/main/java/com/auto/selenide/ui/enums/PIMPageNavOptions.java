package com.auto.selenide.ui.enums;

public enum PIMPageNavOptions {
    CONFIGURATION("Configuration"),
    EMPLOYEE_LIST("Employee List"),
    ADD_EMPLOYEE("Add Employee"),
    REPORTS("Reports");
    private String navOptions;
    PIMPageNavOptions(final String navOptions) {
        this.navOptions = navOptions;
    }
    public String getNavOptions() {
        return this.navOptions;
    }
}
