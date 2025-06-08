package com.gayathri.interview.Strings;

public class RearrangeString {
    // Move Vowels to the Beginning While Keeping Order
    public static void main(String[] args) {
        String str = "Automation";
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();
        str = str.toLowerCase();
        if (str.isEmpty())
            return;
//        if (!str.matches(".*[aeiou].*")) { //checks if there is no vowel present
//            System.out.println("No Vowel present");
//            return;
//        }
        if (str.indexOf('a') == -1 && str.indexOf('A') == -1 && str.indexOf('e') == -1 && str.indexOf('E') == -1
                && str.indexOf('i') == -1 && str.indexOf('I') == -1 && str.indexOf('o') == -1
                && str.indexOf('O') == -1 && str.indexOf('u') == -1 && str.indexOf('U') == -1) {
            System.out.println("No Vowel present");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u')
                vowels.append(str.charAt(i));
            else
                consonants.append(str.charAt(i));
        }

        if (vowels.length() == 0)
            System.out.println("No Vowel present");

        System.out.println(vowels.append(" ").append(consonants));
    }
}
