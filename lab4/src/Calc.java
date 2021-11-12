package main.java.ru.miet.testing;

public final class Calc implements Calculator {
    @Override
    public double sum(double a, double b) {
        return a+b;
    }
    @Override
    public double subtract(double a, double b) {
        return a-b;
    }
    @Override
    public double multiply(double a, double b) {
        return a*b;
    }
    @Override
    public double divide(double a, double b) throws ArithmeticException {
        if (Math.abs(b) < 10e-8)
            throw new ArithmeticException();
        return a/b;
    }
}
