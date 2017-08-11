package com.company;

public class Iteration {
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
        for(int i = 0; i < 10; i++){
            System.out.println(method1(0,3));
            System.out.println(method1(3,3));
        }
    }
}
