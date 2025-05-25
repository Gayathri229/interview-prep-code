package com.gayathri.interview.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int n=6;
        int totalSum = n*(n+1)/2;
        System.out.println(totalSum);
        int arraySum = 0;

        for(int i=0; i<n-1; i++){
            arraySum+=arr[i];
        }

        System.out.println(totalSum - arraySum);


    }
}
