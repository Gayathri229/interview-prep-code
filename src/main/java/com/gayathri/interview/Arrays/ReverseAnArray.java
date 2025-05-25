package com.gayathri.interview.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {

        int[] arr = {34,25,67,69,14};
        int left = 0, right = arr.length - 1 , temp = 0;
        while(left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        for(int element: arr)
            System.out.println(element);
    }
}
