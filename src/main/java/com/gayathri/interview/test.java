package com.gayathri.interview;

public class test {
    public static void main(String args[]){
        test testObj = new test();
        testPractice();
        int sum = testObj.add(1,2);
        if(sum%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    public static void testPractice(){
        System.out.println("First program");
    }

    public void method2(){
        System.out.println("Method 2");
    }

    public int add(int a, int b){
        int sum = a + b;
        return sum;
    }
}
