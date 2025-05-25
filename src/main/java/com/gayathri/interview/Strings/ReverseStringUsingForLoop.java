package com.gayathri.interview.Strings;

public class ReverseStringUsingForLoop {
    public static void main(String[] args) {
        String str = "Robot";
        String reversed = "";

        for(int i=str.length()-1; i>=0; i--){
            reversed +=str.charAt(i);
//            System.out.print(str.charAt(i));
        }
        System.out.println(reversed);
    }
}
