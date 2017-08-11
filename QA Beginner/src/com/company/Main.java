package com.company;

import java.io.Console;

public class Main {

    public static void main(String[] args) {
        method1();
        method2();
        System.out.println(method3());
        System.out.print(method4(3,3));
    }

    private static void method1(){
        System.out.print("Hello ");
    }

    private static void method2(){
        System.out.print(" World ");
    }

    private static String method3(){
        String exclamation = "!";
        return exclamation;
    }

    private static int method4(int i, int z){

        int y = i + z;
        return y;
    }
}
