package com.example.number_sign_check;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignController {

    // URL layout: http://localhost:8080/api/v1/sign/-5
    @GetMapping("/api/v1/sign/{number}")
    public String checkNumberSign(@PathVariable int number) {
        if (number > 0) {
            return number + " is a POSITIVE number.";
        } else if (number < 0) {
            return number + " is a NEGATIVE number.";
        } else {
            return "The number is ZERO.";
        }
    }
}
//