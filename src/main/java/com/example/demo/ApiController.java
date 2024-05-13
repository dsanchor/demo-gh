package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/reverse")
    public String reverseText(@RequestParam String text) {
        System.out.println("Input: " + text);
        String reversedText = new StringBuilder(text).reverse().toString();
        System.out.println("Output: " + reversedText);
        return reversedText;
    }

    @GetMapping("/disemvowel")
    public String removeVowels(@RequestParam String text) {
        System.out.println("Input: " + text);
        String removedVowels = text.replaceAll("[AEIOUaeiou]", "");
        System.out.println("Output: " + removedVowels);
        return removedVowels;
    }

    @GetMapping("/isPalindrome")
    public boolean isPalindrome(@RequestParam String text) {
        System.out.println("Input: " + text);
        String reversedText = new StringBuilder(text).reverse().toString();
        boolean isPalindrome = text.equalsIgnoreCase(reversedText);
        System.out.println("Output: " + isPalindrome);
        return isPalindrome;
    }
}