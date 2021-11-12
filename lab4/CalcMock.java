package main.test.ru.miet.testing;

import main.java.ru.miet.testing.CalculatorView;

public final class CalcMock implements CalculatorView {
    public String a,b;
    public double result;
    public String error;
    @Override
    public void printResult(double result) {
        this.result=result;
    }
    @Override
    public void displayError(String message) {
        error = message;
    }
    @Override
    public String getFirstArgumentAsString() {
        return a;
    }
    @Override
    public String getSecondArgumentAsString() {
        return b;
    }
}