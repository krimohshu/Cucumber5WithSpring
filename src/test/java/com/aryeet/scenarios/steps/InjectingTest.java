package com.aryeet.scenarios.steps;

import com.aryeet.model.CommonSearchCriteria;
import com.aryeet.model.RandomGeneratorSearchCriteria;
import com.aryeet.secnarios.SpringBootBaseIntegrationTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Ignore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.DirtiesContext;

import java.util.List;

@Ignore
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@Component
public class InjectingTest extends SpringBootBaseIntegrationTest {
    private static final Logger log = LoggerFactory.getLogger(InjectingTest.class);
    @Autowired
    private CommonSearchCriteria commonSearchCriteria;
    public InjectingTest(@Value("${base.url}") String baseUrl) {
        super(baseUrl);
    }



}
