package com.example.factorial_calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    // URL layout: http://localhost:8080/api/v1/factorial/5
    @GetMapping("/api/v1/factorial/{number}")
    public String calculateFactorial(@PathVariable int number) {
        if (number < 0) {
            return "Error: Factorial is not defined for negative numbers.";
        }

        long factorial = 1;

        // Loop to compute factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return "The factorial of " + number + " is: " + factorial;
    }
}