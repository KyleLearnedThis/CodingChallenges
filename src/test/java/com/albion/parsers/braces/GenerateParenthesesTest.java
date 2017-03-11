package com.albion.parsers.braces;

import org.testng.annotations.Test;

import java.util.List;

public class GenerateParenthesesTest {
    @Test
    public void testGenerateParenthesis() throws Exception {
        GenerateParentheses g = new GenerateParentheses();
        List<String> list = g.generateParenthesis(3);
        System.out.println("AFTER");
        for(String s : list) {
            System.out.println(" " + s);
        }
    }
}