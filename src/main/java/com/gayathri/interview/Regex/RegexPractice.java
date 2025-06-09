package com.gayathri.interview.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {
    public static void main(String[] args) {

//        Check if a string contains digits

        String input = "My phone number is 12345";
        boolean hasDigits = input.matches(".*\\d.*");
        System.out.println(hasDigits);

//        Validate email address

        String email = "test@example.com";
        boolean isValid = email.matches("^[\\w.-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}$");
        System.out.println(isValid);


//        Extract numbers from a string

        String numberMatch = "Order123, Invoice456";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(numberMatch);
//      System.out.println(matcher.find()); // just checks for number pattern only once
        while(matcher.find())
            //matcher.group() gives us access to the matched regex text. find() just returns if its present or not
            System.out.println(matcher.group());

//      Replace all whitespaces

        String messy = "Java   is \t awesome!";
        String cleaned = messy.replaceAll("\\s+"," ");
        System.out.println(cleaned);

//       Validate phone number (e.g., US format)
        String phone = "123-456-7890";
        boolean isCorrectFormat = phone.matches("\\d{3}-\\d{3}-\\d{4}");
        System.out.println(isCorrectFormat);

//      Case-insensitive Pattern matching
        Pattern pattern1 = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern1.matcher("I love Java");
        System.out.println(matcher1.find());

        //Date format
        String date = "22-09-1999";
        boolean isValidDate = date.matches("\\d{2}-\\d{2}-\\d{4}");
        System.out.println(isValidDate);

        //stricter match
        boolean isDateValid = date.matches(
                "(0[1-9]|[12][0-9]|3[01])-" +  // Day part
                        "(0[1-9]|1[0-2])-" +            // Month part
                        "\\d{4}"                        // Year part
        );
        System.out.println(isDateValid);

        //Extract all words starting with capital letters from a paragraph.
        String para = "The Quick Brown Fox jumps over the Lazy Dog.";
        Pattern pattern2 = Pattern.compile("\\b[A-Z][a-z]+\\b"); // '\\b' - word boundary
        Matcher matcher2 = pattern2.matcher(para);

        while(matcher2.find())
            System.out.println(matcher2.group());


        // HTML cleanup
        String html = "<p>Hello <b>World</b></p>";
        String result = html.replaceAll("<[a-z]+>","").replaceAll("</[a-z]+>", "");
        System.out.println(result);

        //better solution for html
        html.replaceAll("<[^>]+>",""); // quick or dirty HTML stripping
    }
}
