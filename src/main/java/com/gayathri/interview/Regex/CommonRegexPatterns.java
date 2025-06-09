package com.gayathri.interview.Regex;

import java.util.regex.Pattern;

public class CommonRegexPatterns {
    public static void main(String[] args) {
        // . - single character
        System.out.println(isPresent("Java is fun", "Java is fu."));

        // * - any number of characters
        System.out.println(isPresent("Java is fun", "J.*"));

        //starts with - ^
        System.out.println(isPresent("Java is fun", "^Java"));

        System.out.println(isPresent("Java is fun", "^Java.*"));

        //ends with - $
        System.out.println(isPresent("Java is fun", "fun$"));

        //digit
        System.out.println(isPresent("J2", "J\\d"));

        //negative case
        System.out.println(isPresent("Java", "J\\d"));

        //Capital alphabet, digit, space
        System.out.println(isPresent("J4 ", "[A-Z]\\d\\s"));

        //small alphabet, Capital alphabet, digit
        System.out.println(isPresent("gJ4 ", "[a-z][A-Z]\\d\\s"));

        //vowel - irrespective of case [aeiouAEIOU]
        System.out.println(isPresent("OgJ4 ", "[aeiouAEIOU][a-z][A-Z]\\d\\s"));

        //same as above but should start with A
        System.out.println(isPresent("AOgJ4 ", "^A[aeiouAEIOU][a-z][A-Z]\\d\\s"));


    }

    public static boolean isPresent(String input, String search){
        return Pattern.compile(search).matcher(input).find();
    }
}
