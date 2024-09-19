package com.junhyeokkk;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringGithubActionsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringGithubActionsAppApplication.class, args);
    }

    @Value("${spring.application.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @GetMapping(value = {"/", "/index"})
    public String index(){
        return appName + "-" + appVersion;
    }
}
