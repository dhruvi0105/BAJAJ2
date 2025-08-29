package com.example.bfhl.controller;

import com.example.bfhl.model.ApiResponse;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping
public class ApiController {

    @PostMapping("/bfhl")
    public ApiResponse processArray(@RequestBody Map<String, Object> request) {
        List<String> data = (List<String>) request.get("data");

        List<String> evenNumbers = new ArrayList<>();
        List<String> oddNumbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> specialCharacters = new ArrayList<>();
        int sum = 0;

        // Process input
        for (String item : data) {
            if (item.matches("-?\\d+")) { // numeric
                int num = Integer.parseInt(item);
                sum += num;
                if (num % 2 == 0) evenNumbers.add(item);
                else oddNumbers.add(item);
            } else if (item.matches("^[a-zA-Z]+$")) { // alphabets
                alphabets.add(item.toUpperCase());
            } else {
                specialCharacters.add(item);
            }
        }

        // Build concat string from alphabets
        StringBuilder allLetters = new StringBuilder();
        for (String alpha : alphabets) {
            allLetters.append(alpha);
        }
        String reversed = allLetters.reverse().toString();

        StringBuilder altCaps = new StringBuilder();
        for (int i = 0; i < reversed.length(); i++) {
            if (i % 2 == 0) {
                altCaps.append(Character.toUpperCase(reversed.charAt(i)));
            } else {
                altCaps.append(Character.toLowerCase(reversed.charAt(i)));
            }
        }

        // Build Response
        ApiResponse response = new ApiResponse();
        response.setIs_success(true);
        response.setUser_id("john_doe_17091999"); // ← you can build dynamically using full_name+dob
        response.setEmail("john@xyz.com");
        response.setRoll_number("ABCD123");
        response.setOdd_numbers(oddNumbers);
        response.setEven_numbers(evenNumbers);
        response.setAlphabets(alphabets);
        response.setSpecial_characters(specialCharacters);
        response.setSum(String.valueOf(sum));
        response.setConcat_string(altCaps.toString());

        return response;
    }
}
