package com.gayathri.interview.Arrays;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] arr = {13, 20, 3, 4, 50};

        Arrays.sort(arr);

        for(int element : arr)
            System.out.println(element);

    }
}
