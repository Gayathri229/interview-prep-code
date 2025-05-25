package com.gayathri.interview.Strings;

public class SubStringOccurrence {

    public int occurrence(String s, String sub) {
        int index = 0;
        int count = 0;

        while((index = s.indexOf(sub, index)) != -1) {
            count++;
            System.out.println("index "+index);
            index+=sub.length();
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "Hello, World! World!";
        String sub = "World";

        SubStringOccurrence object = new SubStringOccurrence();
        System.out.println(object.occurrence(s, sub));
    }
}
