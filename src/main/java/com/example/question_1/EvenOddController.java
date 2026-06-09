package com.example.question_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOddController {

    // URL: http://localhost:8080/api/v1/check/7
    @GetMapping("/api/v1/check/{number}")
    public String checkEvenOrOdd(@PathVariable int number) {
        if (number % 2 == 0) {
            return "The number " + number + " is EVEN.";
        } else {
            return "The number " + number + " is ODD.";
        }
    }
}