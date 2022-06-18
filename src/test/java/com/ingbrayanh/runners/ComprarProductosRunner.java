package com.ingbrayanh.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
<<<<<<<< HEAD:src/test/java/com/ingbrayanh/runners/TestRunner.java
        features = "src/test/resources/features/test.feature",
        glue = "com.ingbrayanh.stepdefinitions",
========
        features = "src/test/resources/features/comprar_productos.feature",
        glue = "com.ingjuanfg.stepdefinitions",
>>>>>>>> page_factory:src/test/java/com/ingbrayanh/runners/ComprarProductosRunner.java
        snippets = SnippetType.CAMELCASE
)
public class ComprarProductosRunner {
}

