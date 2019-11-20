package com.medical.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MedicalprojectEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicalprojectEurekaApplication.class, args);
    }

}
