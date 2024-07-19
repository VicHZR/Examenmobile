package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.jruby.RubyProcess;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomeScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='App logo and name']")
    private WebElement logoMyDemoApp;

    public void wait_until_logo_app() {
        System.out.println("Entro a la función wait_until_logo_app");
        long startTime = System.currentTimeMillis();

        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(logoMyDemoApp));

        long endTime = System.currentTimeMillis();
        long segundosTranscurridos = (endTime - startTime) / 1000;

        System.out.println("Terminé la función wait_until_logo_app en " + segundosTranscurridos + " segundos");
    }


}
