package com.company;

public class Iteration_Arrays {

    private static int[] myArray = new int[9];
    public static void main(String[] args) {
        method2();
        method3();
    }
    private static int method1(int x, int y) {
        int z;
        z = x + y;
        if (x == 0) {
            z = y;
            return z;
        } else if (y == 0) {
            z = x;
            return z;
        }
        return z;
    }
    private static void method2(){

        for(int i = 0; i < myArray.length; i++){

            myArray[i] = method1(3,4);
        }
    }

    private static void method3(){

        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }
}
