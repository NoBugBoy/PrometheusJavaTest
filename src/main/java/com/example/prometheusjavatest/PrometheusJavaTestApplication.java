package com.example.prometheusjavatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class PrometheusJavaTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(PrometheusJavaTestApplication.class, args);
    }

}
