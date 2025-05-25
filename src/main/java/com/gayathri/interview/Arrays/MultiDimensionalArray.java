package com.gayathri.interview.Arrays;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        //multi dimensional array
        int[][] matrix = {
                {1,2,3},  //00 01 02
                {4,5,6},  //10 11 12
                {7,8,9}   //20 21 22
        };

        System.out.println(matrix[0][1]);
        System.out.println(matrix.length);

        for(int i=0; i< matrix.length; i++)
            for(int j=0; j<matrix[i].length; j++)
                System.out.println(matrix[i][j]);


        //convert array to string
        String[] str = {"abc", "def", "ghi"};
        System.out.println(Arrays.toString(str)); //readable string format

        //copying an array
        String[] newArray = Arrays.copyOf(str, str.length);
        for(String element : newArray)
            System.out.println(element);
    }
}
