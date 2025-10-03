// src/main/java/com/example/Calculator.java
package com.example;

public class Calculator {
    public long add(int a, int b) {
        //core addition fun
        return (long)a + b;

    }
    public int sub(int a, int b) {
	return a-b;
    }
    public int multiply(int a, int b) {
        return a*b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public double div(int a, int b) {
        return 1.0*a/b;
    }
    public double sub(double a, double b) {
        return a - b;
    }
}