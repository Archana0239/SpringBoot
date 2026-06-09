package com.example.csv_data_reader;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CsvReaderController {

    // URL layout: http://localhost:8080/api/v1/read-csv
    @GetMapping("/api/v1/read-csv")
    public List<String> readStudentCsv() {
        List<String> records = new ArrayList<>();
        String csvFile = "students.csv"; // Looks for file in the project root directory
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            int count = 0;
            // Read lines and display up to the first 11 records (Header + 10 data rows)
            while ((line = br.readLine()) != null && count < 11) {
                records.add(line);
                count++;
            }
        } catch (IOException e) {
            records.add("Error reading CSV file: " + e.getMessage() + ". Please check if 'students.csv' is in the project root folder.");
        }

        return records;
    }
}