package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    public void action() {
        int y = 0;
        y++;
        System.out.println(y);
        System.out.println(String.format("1:%d", y));
        System.out.println(String.format("02:%d", y));
    }
}
