package com.daniel.onepage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OnePageApplication {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }


    public static void main(String[] args) {
        SpringApplication.run(OnePageApplication.class, args);
    }
}
