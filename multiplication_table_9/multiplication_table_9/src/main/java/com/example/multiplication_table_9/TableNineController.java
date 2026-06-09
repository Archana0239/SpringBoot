package com.example.multiplication_table_9;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TableNineController {

    // URL layout: http://localhost:8080/api/v1/table9
    @GetMapping("/api/v1/table9")
    public List<String> getTableOfNine() {
        List<String> table = new ArrayList<>();

        // Loop from 1 to 10 to generate the table of 9
        for (int i = 1; i <= 10; i++) {
            table.add("9 * " + i + " = " + (9 * i));
        }

        return table;
    }
}