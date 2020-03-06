package com.aryeet.config.webdriver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.net.MalformedURLException;
import java.net.URL;

@Component
public class BrowserStackProperties {

    @Autowired
    private Environment environment;

}