package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/reverse")
    public String reverseText(@RequestParam String text) {
        return new StringBuilder(text).reverse().toString();
    }

    @GetMapping("/disemvowel")
    public String removeVowels(@RequestParam String text) {
        return text.replaceAll("[AEIOUaeiou]", "");
    }
}