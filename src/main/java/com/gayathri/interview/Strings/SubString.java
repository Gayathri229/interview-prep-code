package com.gayathri.interview.Strings;

public class SubString {

    public boolean isSubString(String s, String sub) {
        return s.contains(sub);
    }

    public static void main(String[] args) {
        String s = "Hello World";
        String sub = "World";
        SubString object = new SubString();
        System.out.println(object.isSubString(s, sub));
    }
}
