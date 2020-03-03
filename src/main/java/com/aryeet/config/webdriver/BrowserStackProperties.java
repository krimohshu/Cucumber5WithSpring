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

    public String os() {
        return environment.getProperty("browserstack.os");
    }

    public String osVersion() {
        return environment.getProperty("browserstack.os_version");
    }

    public String browser() {
        return environment.getProperty("browserstack.browser");
    }

    public String browserVersion() {
        return environment.getProperty("browserstack.browser_version");
    }

    public String resolution() {
        return environment.getProperty("browserstack.resolution");
    }

    public URL url() {
        try {
            return new URL(environment.getProperty("browserstack.url"));
        } catch (final MalformedURLException e) {
            throw new RuntimeException("Unabled to parse browserstack url", e);
        }
    }
}