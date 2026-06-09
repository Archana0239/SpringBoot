package com.example.temperature_converter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController {

    // URL layout: http://localhost:8080/api/v1/convert/100/fahrenheit
    @GetMapping("/api/v1/convert/{value}/{targetUnit}")
    public String convertTemperature(@PathVariable double value, @PathVariable String targetUnit) {
        String unit = targetUnit.toLowerCase();

        if (unit.equals("fahrenheit") || unit.equals("f")) {
            // Celsius to Fahrenheit: (C * 9/5) + 32
            double converted = (value * 9.0 / 5.0) + 32.0;
            return value + "°C is equal to " + String.format("%.2f", converted) + "°F.";
        } else if (unit.equals("celsius") || unit.equals("c")) {
            // Fahrenheit to Celsius: (F - 32) * 5/9
            double converted = (value - 32.0) * 5.0 / 9.0;
            return value + "°F is equal to " + String.format("%.2f", converted) + "°C.";
        } else {
            return "Invalid target unit! Please use 'celsius' or 'fahrenheit'.";
        }
    }
}