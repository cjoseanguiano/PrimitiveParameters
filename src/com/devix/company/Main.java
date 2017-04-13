package com.devix.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        go();
    }

    public static void go() {
        int x = 3;
        int y = 2;
        System.out.println("En el metodo go x: " + x + " y " + y);
        valueSwap(x, y);
        System.out.println("En el metodo go x: " + x + " y " + y);
        moreParameters(x, y);
        System.out.println("En el metodo go x: " + x + " y " + y);

    }

    private static void valueSwap(int x, int y) {
        System.out.println("En el metodo valueSwap x: " + x + " y " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("En el metodo valueSwap x: " + x + " y " + y);
    }

    private static void moreParameters(int a, int b) {
        System.out.println("En el metodo moreParameters a: " + a + " b " + b);
        a = a * b;
        b = 12;
        System.out.println("En el metodo moreParameters a: " + a + " b " + b);
        valueSwap(a, b);
        System.out.println("En el metodo moreParameters a: " + a + " b " + b);

    }
}
