package com.example.student_grade_calculation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentGradeController {

    // URL layout: http://localhost:8080/api/v1/student-grade?name=Archana&maths=95&physics=88&chemistry=92
    @GetMapping("/api/v1/student-grade")
    public String calculateStudentGrade(
            @RequestParam String name,
            @RequestParam int maths,
            @RequestParam int physics,
            @RequestParam int chemistry) {

        // Basic validation checking
        if (maths < 0 || maths > 100 || physics < 0 || physics > 100 || chemistry < 0 || chemistry > 100) {
            return "Invalid marks! Marks for each subject must be between 0 and 100.";
        }

        int totalMarks = maths + physics + chemistry;
        double percentage = totalMarks / 3.0;
        String grade;

        // Determine grade based on percentage performance
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F (Fail)";
        }

        return String.format(
                "Student Name: %s | Total Marks: %d/300 | Percentage: %.2f%% | Final Grade: %s",
                name, totalMarks, percentage, grade
        );
    }
}