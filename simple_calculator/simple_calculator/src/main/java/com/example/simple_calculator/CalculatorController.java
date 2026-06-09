package com.example.simple_calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    // URL layout: http://localhost:8080/api/v1/calculate/10/mul/5
    @GetMapping("/api/v1/calculate/{num1}/{operation}/{num2}")
    public String calculate(@PathVariable double num1, @PathVariable String operation, @PathVariable double num2) {
        switch (operation.toLowerCase()) {
            case "add":
                return num1 + " + " + num2 + " = " + (num1 + num2);
            case "sub":
                return num1 + " - " + num2 + " = " + (num1 - num2);
            case "mul":
                return num1 + " * " + num2 + " = " + (num1 * num2);
            case "div":
                if (num2 == 0) {
                    return "Error: Division by zero is not allowed!";
                }
                return num1 + " / " + num2 + " = " + (num1 / num2);
            default:
                return "Invalid operation! Please use 'add', 'sub', 'mul', or 'div'.";
        }
    }
}