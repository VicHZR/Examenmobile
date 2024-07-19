package com.nttdata.steps;

import com.nttdata.screens.HomeScreen;
import io.restassured.internal.common.assertion.Assertion;
import org.junit.Assert;

public class HomeSteps {
    HomeScreen home;

    public void wait_until_logo_app() {
        home.wait_until_logo_app();
    }
}
