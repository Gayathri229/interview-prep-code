package com.gayathri.interview.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        //Declaration
        int[] arr = new int[5];

        //initialization
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println("Length " + arr.length);

        for(int i=0; i<arr.length; i++)
            System.out.println("Element " + i + " " + arr[i]);

        // declaration + initialization in one line
        int[] array = {12, 22, 34, 45, 56};

        //enhanced for loop
        for(int element: array)
            System.out.println(element);

    }
}

