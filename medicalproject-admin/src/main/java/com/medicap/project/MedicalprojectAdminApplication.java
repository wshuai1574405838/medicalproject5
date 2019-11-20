package com.medicap.project;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages={"com.medical.project.user.api"})
@EnableHystrix
@SpringCloudApplication
public class MedicalprojectAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicalprojectAdminApplication.class, args);
    }

}
