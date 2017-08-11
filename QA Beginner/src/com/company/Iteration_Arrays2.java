package com.company;

public class Iteration_Arrays2 {


    public static void main(String[] args){
        method1();

    }
    private static void method1(){
        int[] myArray = new int[11];
        for(int i = 1; i <myArray.length; i++){
            myArray[i] = i;
            System.out.println(myArray[i]);
        }
        method2(myArray);
    }

    private static void method2(int[] myArray){
        for(int i = 1; i < myArray.length; i++){
            myArray[i] = (i * 10);
            System.out.println(myArray[i]);
        }
    }
}
