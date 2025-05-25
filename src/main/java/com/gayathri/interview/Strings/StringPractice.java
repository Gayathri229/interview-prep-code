package com.gayathri.interview.Strings;

public class StringPractice {

    public static void main(String args[]){

        // String literal
        String str = "testing";
        String str1 = "testing";
        System.out.println(str);
        System.out.println(str == str1); //checks if memory reference is equal
        System.out.println(str.equals(str1)); //checks if the values are equal

        // using new keyword/using object/using string constructor
        String strObj = new String("testing with obj");
        String strObj1 = new String("testing with obj");
        System.out.println(strObj);
        System.out.println(strObj == strObj1);
        System.out.println(strObj.equals(strObj1));


        String originalString = "Hello";
        System.out.println("Original String: " + originalString);

        originalString.concat("world");
//        System.out.println("Modified String: " + modifiedString);

        System.out.println("Original string after modification attempt: " + originalString);
        // Strings are immutable

        //String Buffer and String Builder can be used to make strings mutable
        //thread safe
        StringBuffer sb = new StringBuffer("Hellow");
        sb.append(" World");
        System.out.println(sb);

        //not thread safe. We use this more often
        StringBuilder sb1 = new StringBuilder("Helloww");
        sb1.append(" Walrddd");
        System.out.println(sb1);


        //String methods
        String strMethod = "testing";
        System.out.println(strMethod.charAt(2));
        System.out.println("ABC".equalsIgnoreCase("abc"));
        System.out.println("ABC".equals("abc"));
        System.out.println("ABC".replace("C", "A"));
        System.out.println("ABC".toLowerCase());
        System.out.println("abc".toUpperCase());
        System.out.println(" Abcd ".trim().equals("Abcd")); //removes leading and trailing spaces
        System.out.println("apple".substring(3)); // le
        System.out.println("apple".substring(0)); // apple
        System.out.println("apple".substring(1, 4)); // ppl
        System.out.println("apple".indexOf("a")); //returns index of first occurrence
        System.out.println("apple".indexOf("p", 2));

        int index = "aplpe".indexOf("p");
        System.out.println("aplpe".indexOf("p", index+1));
        // here we don't know the 2nd occurrence of p, so we find the 1st occurrence and pass index+1 again
        // to find the 2nd occurrence




    }

}
