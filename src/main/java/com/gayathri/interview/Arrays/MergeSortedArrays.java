package com.gayathri.interview.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,3,6,10};

        int[] mergedArray = new int[arr1.length+arr2.length];
        int i=0, j=0, k=0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j])
                mergedArray[k++] = arr1[i++];
            else
                mergedArray[k++] = arr2[j++];
        }

        while(i < arr1.length)
            mergedArray[k++] = arr1[i++];

        while(j < arr2.length)
            mergedArray[k++] = arr2[j++];

        for(int x=0; x<mergedArray.length; x++)
            System.out.println(mergedArray[x]);
    }
}
