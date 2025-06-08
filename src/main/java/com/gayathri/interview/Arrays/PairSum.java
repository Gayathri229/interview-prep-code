package com.gayathri.interview.Arrays;

public class PairSum {

    public static void main(String[] args) {
        int[] arr = {2, 7, 4, -5, 11, 5, 20};
        int target = 11;

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target)
                    System.out.println("Pair " + arr[i] +" " + arr[j]);
            }
        }

    }
}
