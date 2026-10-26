package com.example;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Java Git Starter");
        System.out.println("2 + 3 = " + calculator.add(2, 3));
        System.out.println("9 - 4 = " + calculator.subtract(9, 4));
        System.out.println("4 * 5 = " + calculator.multiply(4, 5));
        System.out.println("10 / 4 = " + calculator.divide(10, 4));
    }
}
