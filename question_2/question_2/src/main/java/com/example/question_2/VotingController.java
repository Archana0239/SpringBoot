package com.example.question_2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VotingController {

    // URL layout: http://localhost:8080/api/v1/vote/20
    @GetMapping("/api/v1/vote/{age}")
    public String checkVotingEligibility(@PathVariable int age) {
        if (age >= 18) {
            return "Age " + age + ": Eligible to vote.";
        } else {
            return "Age " + age + ": Not eligible to vote. You must wait " + (18 - age) + " more year(s).";
        }
    }
}