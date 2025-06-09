package com.gayathri.interview.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {
    public static void main(String[] args) {
        String input = "Java is fun";
        Pattern pattern = Pattern.compile("Java");
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.find());

        // optimized version
        System.out.println(Pattern.compile("java").matcher(input).find());

        // more optimized version
        System.out.println(isPresent("Java is fun", "Java"));
    }


    public static boolean isPresent(String input, String search){
        return Pattern.compile(search).matcher(input).find();
    }
}
