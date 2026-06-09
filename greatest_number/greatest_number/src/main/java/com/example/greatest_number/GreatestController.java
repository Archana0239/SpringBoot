package com.example.greatest_number;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreatestController {

    // URL layout: http://localhost:8080/api/v1/greatest/15/42
    @GetMapping("/api/v1/greatest/{num1}/{num2}")
    public String findGreatestNumber(@PathVariable int num1, @PathVariable int num2) {
        if (num1 > num2) {
            return num1 + " is greater than " + num2 + ".";
        } else if (num2 > num1) {
            return num2 + " is greater than " + num1 + ".";
        } else {
            return "Both numbers are equal (" + num1 + ").";
        }
    }
}