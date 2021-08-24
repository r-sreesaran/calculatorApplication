package org.sree.services;

import java.util.List;

public class Calculator {

    List<Integer> values;
    int displayValue;

    public int add() {
        int total=0;
        total += displayValue;
        for(int item:values) {
            total += item;
        }
        return total;
    }

    public int subtract() {
        int total=0;
        total -=
                displayValue;
        for(int item:values) {
            total -= item;
        }
        return total;
    }

    public int multiply() {
        int total=1;
        total *= displayValue;
        for(int item:values) {
            total *= item;
        }
        return total;
    }

    public Calculator(List<Integer> values) {
        this.values = values;
    }

    public Calculator() {

    }

    public void clearDisplayValue() {
        displayValue = 0;
    }
    public void  setDisplayValue(int value) {displayValue=value;}
}
