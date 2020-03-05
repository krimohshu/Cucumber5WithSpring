package com.aryeet.scenarios.steps;

import com.aryeet.RandomGeneratorApp;
import com.aryeet.config.webdriver.SharedDriver;
import io.cucumber.core.internal.gherkin.ast.Scenario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

@ActiveProfiles("dev")
@ContextConfiguration(classes = RandomGeneratorApp.class, initializers = { ConfigFileApplicationContextInitializer.class })
public abstract class AbstractStepDefinition {

    @Autowired
    SharedDriver driver;
}
