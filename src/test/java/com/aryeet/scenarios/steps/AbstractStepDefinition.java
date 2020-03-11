package com.aryeet.scenarios.steps;

import com.aryeet.RandomGeneratorApp;
import com.aryeet.config.webdriver.SharedDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

@ActiveProfiles("dev")
@ContextConfiguration(classes = RandomGeneratorApp.class, initializers = { ConfigFileApplicationContextInitializer.class })
@TestPropertySource({
        "classpath:application.properties",
        "classpath:application-${spring.profiles.active}.properties"
})
public abstract class AbstractStepDefinition {

    @Autowired
    SharedDriver driver;
}
