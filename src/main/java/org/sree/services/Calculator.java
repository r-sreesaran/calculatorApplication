package org.sree.services;

public class Calculator {

    int a;
    int b;
    int displayValue;

    public int add() {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }

    public int multiply() {
        return a * b;
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void clearDisplayValue() {
        displayValue = 0;
    }

}
