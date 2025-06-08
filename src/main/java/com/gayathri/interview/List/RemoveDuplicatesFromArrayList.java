package com.gayathri.interview.List;

import java.util.*;

public class RemoveDuplicatesFromArrayList {
    public static void main(String[] args) {
        List<Integer> duplicates = new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5));
        Set<Integer> set = new HashSet<>(duplicates);
        List<Integer> withoutDuplicates = new ArrayList<>(set);
        System.out.println(withoutDuplicates);
    }
}
