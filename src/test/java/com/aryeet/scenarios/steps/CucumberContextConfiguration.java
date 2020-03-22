package com.aryeet.scenarios.steps;

import com.aryeet.CucumberAutomationApp;
import io.cucumber.java.Before;
import org.junit.Test;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@ActiveProfiles("dev")
@ContextConfiguration(classes = CucumberAutomationApp.class, initializers = { ConfigFileApplicationContextInitializer.class })
@TestPropertySource({
        "classpath:application.properties",
        "classpath:application-${spring.profiles.active}.properties"
})
public class CucumberContextConfiguration  {

    @Before
    public void setup_cucumber_spring_context(){
        // Dummy method so cucumber will recognize this class as glue
        // and use its context configuration.
    }

    @Test
    public void contextIntegrationTest(){
        System.out.println("A test of springboottest config");
    }
} 