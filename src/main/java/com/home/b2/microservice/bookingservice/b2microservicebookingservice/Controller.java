package com.home.b2.microservice.bookingservice.b2microservicebookingservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
//@RequestMapping("/env")
public class Controller {

    @GetMapping("/health")
    public String healthCheck() {
        return "Booking Server is alive. Current time: " + Instant.now();
    }

    @GetMapping("/")
    String hello() {
        return "Hello from booking service.";
    }
}
