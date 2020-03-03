package com.aryeet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;


/*@RunWith(SpringRunner.class)

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)*/
//@AutoConfigureMockMvc
//@WebAppConfiguration
//@ImportResource({ "file:application.property" })
//@PropertySource("classpath:application.properties")
//@TestPropertySource(locations = "classpath:application.properties")
//@ActiveProfiles("dev")
public class ControllerMockMvcTest {

    RestTemplate restTemplate = new RestTemplate();

  /*  @LocalServerPort
    int randomServerPort;*/

   /*@Test
   public void contextLoads() throws Exception {
   }*/

   //RestTamplate POST test
    /*@Test
    public void createProduct() throws Exception {
        *//*ResponseEntity<String> response  =  restTemplate.postForEntity("http://localhost:" +randomServerPort + "createproduct" ,new Product(12.0 , "candy") , Product.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody().getName()).isEqualTo("candy");
        assertThat(response.getBody()).isInstanceOf(Product.class);*//*

   }*/

}
