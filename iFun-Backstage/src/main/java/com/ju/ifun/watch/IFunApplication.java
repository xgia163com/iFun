package com.ju.ifun.watch;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication()
public class IFunApplication {
    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(IFunApplication.class);
        //Environment env = app.run(args).getEnvironment();
        //SpringApplication.run(IFunApplication.class, args);



    }

}
