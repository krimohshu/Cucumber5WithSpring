package com.aryeet.scenarios.steps;

import com.aryeet.model.CommonSearchCriteria;
import com.aryeet.secnarios.RandomGeneratorAppTest;
import org.junit.Ignore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;

public class InjectingTest extends RandomGeneratorAppTest {
    private static final Logger log = LoggerFactory.getLogger(InjectingTest.class);

    @Autowired
    private CommonSearchCriteria commonSearchCriteria;

    public InjectingTest(@Value("${base.url}") String baseUrl) {
        super(baseUrl);
    }

}
