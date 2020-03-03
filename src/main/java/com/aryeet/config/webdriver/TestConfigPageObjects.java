package com.aryeet.config.webdriver;



import com.aryeet.pages.AppLandingPage;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * Spring configuration for autowired objects
 */
@Configuration
@ComponentScan("com.sedex.bdd.automation.sedex.bdd.common.config")
//@PropertySource(value = {"classpath:properties.${ENV_SYSTEM:qa}/props-for-api-tests.properties", "classpath:properties.${ENV_SYSTEM:qa}/props-for-ui-tests.properties"})
public class TestConfigPageObjects {

   /* @Autowired
    TestProperties properties;*/

    @Autowired
    private Environment environment;


    @Autowired
    private SharedDriver sharedDriver;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate(new HttpComponentsClientHttpRequestFactory(httpClient()));
    }

    @Bean
    public HttpClient httpClient() {
        return HttpClientBuilder.create().build();
    }


    @Bean
    public AppLandingPage appLandingPage() {
        return new AppLandingPage(environment.getProperty("base.url"), sharedDriver, 30);
    }

}
