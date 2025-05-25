package com.gayathri.interview.Strings;

public class ReverseAStringUsingStringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello World");
        System.out.println(str.reverse().toString());

        StringBuffer str1 = new StringBuffer("Robot");
        System.out.println(str1.reverse().toString());
    }
}
