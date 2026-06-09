package com.example.leap_year_checker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeapYearController {

    // URL layout: http://localhost:8080/api/v1/leap/2024
    @GetMapping("/api/v1/leap/{year}")
    public String checkLeapYear(@PathVariable int year) {
        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                // If it's a century year, it must be divisible by 400
                isLeap = (year % 400 == 0);
            } else {
                isLeap = true;
            }
        }

        if (isLeap) {
            return year + " is a LEAP YEAR.";
        } else {
            return year + " is a NORMAL YEAR.";
        }
    }
}