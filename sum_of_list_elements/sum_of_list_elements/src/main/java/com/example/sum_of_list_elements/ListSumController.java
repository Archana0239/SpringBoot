package com.example.sum_of_list_elements;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ListSumController {

    // URL layout: http://localhost:8080/api/v1/listsum?numbers=10,20,30,40
    @GetMapping("/api/v1/listsum")
    public String calculateListSum(@RequestParam List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return "The list is empty. Total sum is 0.";
        }

        int sum = 0;

        // Loop through the array/list to calculate the total sum
        for (int num : numbers) {
            sum += num;
        }

        return "The elements in the list are: " + numbers + " | Total Sum = " + sum;
    }
}