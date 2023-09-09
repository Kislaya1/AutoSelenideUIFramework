package com.auto.selenide.ui.enums;

public enum FileLocations {
    EMPLOYEE_PROFILE_IMAGE("images/Google.png");
    private String location;

    FileLocations(final String location) {
        this.location = location;
    }

    public String getLocation() {
        return this.location;
    }
}
