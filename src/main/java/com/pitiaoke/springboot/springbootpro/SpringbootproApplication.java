package com.pitiaoke.springboot.springbootpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class SpringbootproApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootproApplication.class, args);
        //annation from github
        //local repository get
    }

}
