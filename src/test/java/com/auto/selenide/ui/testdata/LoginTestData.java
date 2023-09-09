package com.auto.selenide.ui.testdata;

import com.auto.selenide.ui.entity.LoginDetails;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class LoginTestData {
  private LoginTestData() {}
  public static LoginDetails getLoginData() {
    PodamFactory factory = new PodamFactoryImpl();
    return factory.manufacturePojo(LoginDetails.class);
  }
}
