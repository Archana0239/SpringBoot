package com.example.prime_number_check;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeController {

    // URL layout: http://localhost:8080/api/v1/prime/7
    @GetMapping("/api/v1/prime/{number}")
    public String checkPrime(@PathVariable int number) {
        if (number <= 1) {
            return number + " is NOT a prime number.";
        }

        boolean isPrime = true;

        // Loop from 2 up to the square root of the number for maximum efficiency
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            return number + " is a PRIME number.";
        } else {
            return number + " is NOT a prime number.";
        }
    }
}