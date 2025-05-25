package com.gayathri.interview.Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1,3,3,6,9,10,6,9,14};

        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for(int element : arr){
            if(!seen.contains(element))
                seen.add(element);
            else
                duplicates.add(element);
        }

        System.out.println(duplicates);
    }
}
