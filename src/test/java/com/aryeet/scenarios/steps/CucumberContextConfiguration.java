package com.aryeet.scenarios.steps;

import com.aryeet.CucumberAutomationApp;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("qa")
@EnableAutoConfiguration
@ContextConfiguration(classes = CucumberAutomationApp.class)
@TestPropertySource({
        "classpath:application.properties",
        "classpath:application-${spring.profiles.active}.properties"
})
public class CucumberContextConfiguration {

    @Autowired
    private ConfigurableEnvironment env;

   /* @LocalServerPort
    protected int port;
*/
    private RequestSpecification requestSpecification;
    private final String version;

    @Autowired
    public CucumberContextConfiguration(@Value("${rest.baseurl}") String baseUrl, @Value("${version.number}") String version) {
        this.version = version;
        RestAssured.baseURI = baseUrl + version;
        //TODO: Removed relaxedHTTPSValidation when trusted cert is used. Add trusted cert to keystore
        requestSpecification = RestAssured.given().relaxedHTTPSValidation();

    }

    @Test
    public void contextIntegrationTest() {
        System.out.println("A test of springboottest config");
    }

    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }

    public void setRequestSpecification(RequestSpecification requestSpecification) {
        this.requestSpecification = requestSpecification;
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

    public String getBaseUrl() {
        return RestAssured.baseURI;
    }

    public String getVersion() {
        return version;
    }

    public RequestSpecification clearRequestSpecification() {
        requestSpecification = RestAssured.given().relaxedHTTPSValidation();
        return requestSpecification;
    }

    public String getEndPointUrl(String endpointInCucumber) {

        final String endpoint;

        switch (endpointInCucumber) {
            case "EMPLOYEES_BASEURL":
                endpoint = env.getProperty("EMPLOYEES_BASEURL");
                break;

            case "CREATE_EMPLOYEE_BASEURL":
                endpoint = env.getProperty("CREATE_EMPLOYEE_BASEURL");
                break;

            default:
                throw new IllegalArgumentException("Invalid endpoint in cucumber feature file: " + endpointInCucumber);

        }
        return endpoint;
    }

    @Given("hi")
    public void hi(){

    }

}