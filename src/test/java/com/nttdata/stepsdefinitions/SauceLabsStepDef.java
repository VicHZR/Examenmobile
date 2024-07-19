package com.nttdata.stepsdefinitions;

import com.nttdata.steps.HomeSteps;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class SauceLabsStepDef {
    @Steps
    HomeSteps home;

    @Given("estoy en la aplicacion de SauceLabs")
    public void estoyEnLaAplicacionDeSauceLabs() {
        home.wait_until_logo_app();
    }

}
