package com.ingjuanfg.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
<<<<<<< HEAD:src/test/java/com/ingjuanfg/runners/LoginSaucedemoRunner.java
        features = "src/test/resources/features/add_product_cart_saucedemo.feature",
=======
        features = "src/test/resources/features/login_saucedemo.feature",
>>>>>>> origin:src/test/java/com/ingjuanfg/runners/TestRunner.java
        glue = "com.ingjuanfg.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class LoginSaucedemoRunner {
}

