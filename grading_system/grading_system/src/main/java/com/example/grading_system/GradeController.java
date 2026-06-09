package com.example.grading_system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradeController {

    // URL layout: http://localhost:8080/api/v1/grade/85
    @GetMapping("/api/v1/grade/{marks}")
    public String calculateGrade(@PathVariable int marks) {
        if (marks < 0 || marks > 100) {
            return "Invalid marks entered! Please enter a value between 0 and 100.";
        }

        if (marks >= 90) {
            return "Marks: " + marks + "% -> Grade A";
        } else if (marks >= 80) {
            return "Marks: " + marks + "% -> Grade B";
        } else if (marks >= 70) {
            return "Marks: " + marks + "% -> Grade C";
        } else if (marks >= 60) {
            return "Marks: " + marks + "% -> Grade D";
        } else {
            return "Marks: " + marks + "% -> Grade F (Fail)";
        }
    }
}