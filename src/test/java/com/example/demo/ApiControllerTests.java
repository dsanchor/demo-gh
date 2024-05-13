package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(ApiController.class)
public class ApiControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testReverseText() throws Exception {
        String inputText = "Hello World";
        String expectedOutput = "dlroW olleH";

        mockMvc.perform(MockMvcRequestBuilders.get("/api/reverse")
                .param("text", inputText))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedOutput));
    }

    // test for reverse with empty string
    @Test
    public void testReverseTextEmpty() throws Exception {
        String inputText = "";
        String expectedOutput = "";

        mockMvc.perform(MockMvcRequestBuilders.get("/api/reverse")
                .param("text", inputText))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedOutput));
    }

    // test reverse with special chars
    @Test
    public void testReverseTextSpecialChars() throws Exception {
        String inputText = "Hello World!";
        String expectedOutput = "!dlroW olleH";

        mockMvc.perform(MockMvcRequestBuilders.get("/api/reverse")
                .param("text", inputText))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedOutput));
    }

    @Test
    public void testRemoveVowels() throws Exception {
        String inputText = "Hello World";
        String expectedOutput = "Hll Wrld";

        mockMvc.perform(MockMvcRequestBuilders.get("/api/disemvowel")
                .param("text", inputText))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(expectedOutput));
    }

    @Test
    public void testIsPalindrome() throws Exception {
        String palindromeText = "racecar";
        String nonPalindromeText = "hello";

        mockMvc.perform(MockMvcRequestBuilders.get("/api/isPalindrome")
                .param("text", palindromeText))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("true"));

        mockMvc.perform(MockMvcRequestBuilders.get("/api/isPalindrome")
                .param("text", nonPalindromeText))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("false"));
    }
}