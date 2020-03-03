package com.aryeet.secnarios;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource({
        "classpath:application.properties",
        "classpath:application-${spring.profiles.active}.properties"
})
public  class SpringBootBaseIntegrationTest {
    private static final Logger log = LoggerFactory.getLogger(SpringBootBaseIntegrationTest.class);

    @Autowired
    private ConfigurableEnvironment env;


    private RequestSpecification requestSpecification;

    @LocalServerPort
    protected int port;



    @Autowired
    public SpringBootBaseIntegrationTest(@Value("${base.url}") String baseUrl) {
      //  super(baseUrl, version);

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
