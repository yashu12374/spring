package com.xworkz.springapp.coreConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.springapp")
public class CoreConfiguration {

    public CoreConfiguration(){
        System.out.println("CoreConfiguration invoked..");
    }
}
