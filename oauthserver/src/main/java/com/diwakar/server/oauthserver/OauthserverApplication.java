package com.diwakar.server.oauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableResourceServer
@SpringBootApplication
public class OauthserverApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        System.out.println("Before Init");
        SpringApplication.run(OauthserverApplication.class, args);
        System.out.println("Diwakar Shukla");
    }


}
