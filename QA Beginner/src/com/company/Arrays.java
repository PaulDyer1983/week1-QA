package com.company;

public class Arrays {

    public static void main(String[] args) {
        method2();
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
        int[] myArray = new int[9];
        for(int i = 0; i < myArray.length; i++){

            myArray[i] = method1(3,4);
        }
    }
}
