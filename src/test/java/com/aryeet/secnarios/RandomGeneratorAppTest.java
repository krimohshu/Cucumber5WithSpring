package com.aryeet.secnarios;


import com.aryeet.RandomGeneratorApp;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT , classes =  RandomGeneratorApp.class)
@ContextConfiguration(classes = {  RandomGeneratorApp.class})
@ActiveProfiles("dev")
@EnableConfigurationProperties
@TestPropertySource({
        "classpath:application.properties",
        "classpath:application-${spring.profiles.active}.properties"
})
public class RandomGeneratorAppTest {
    private static final Logger log = LoggerFactory.getLogger(RandomGeneratorAppTest.class);

    @Autowired
    private ConfigurableEnvironment env;

    private RequestSpecification requestSpecification;

    @LocalServerPort
    protected int port;

    @Autowired
    public RandomGeneratorAppTest(@Value("${base.url}") String baseUrl) {
        System.out.println("I am in SpringBootBaseIntegrationTest & baseUrl" + baseUrl);
        RestAssured.baseURI = baseUrl;
        requestSpecification = RestAssured.given().relaxedHTTPSValidation();
    }

    public Response get(String endpoint) {
        return requestSpecification.get(endpoint);
    }

    public void header(String key, String value) {
        requestSpecification.header(key, value);
    }

    public Response post(String endpoint) {
        return requestSpecification.post(endpoint);
    }

    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }

    public String getBaseUrl() {
        return RestAssured.baseURI;
    }


    public RequestSpecification clearRequestSpecification() {
        requestSpecification = RestAssured.given().relaxedHTTPSValidation();
        return requestSpecification;
    }

}
