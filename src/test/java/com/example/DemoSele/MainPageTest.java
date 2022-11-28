package com.example.DemoSele;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pom.page.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class MainPageTest {
  MainPage mainPage = new MainPage();

  @BeforeAll
  public static void setUpAll() {
//    Configuration.browserSize = "1280x800";
    SelenideLogger.addListener("allure", new AllureSelenide());
  }

  @BeforeEach
  public void setUp() {
    open("https://tiki.vn/");
  }

  @Test
  public void search() {
    mainPage.searchData.sendKeys("Seleium web driver");
    mainPage.searchButton.click();
    Selenide.screenshot("TestCapture");
    Selenide.sleep(1500);
    Assert.assertEquals(true, true);
  }
}
