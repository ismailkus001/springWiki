package com.springWiki.SpringWiki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ComponentScan(basePackages = {"springWiki"})
public class SpringWikiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWikiApplication.class, args);
    }

}
