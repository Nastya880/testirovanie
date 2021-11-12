package main.test.ru.miet.testing;

import main.java.ru.miet.testing.CalcPres;
import main.java.ru.miet.testing.CalculatorPresenter;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public final class CalculatorTest{
    private final CalcMock mock = new CalcMock();
    private final CalculatorPresenter calcPres = new CalcPres(mock);
    private final String[] errors = {"not number", "Enter number", "oooo..../0 :("};

    @Test
    public void firstArgIsNullPlus() {
        mock.a = null;
        mock.b = String.valueOf(Math.random());
        calcPres.onPlusClicked();
        assertEquals(errors[1],mock.error);
    }
    @Test
    public void firstArgIsNullMinus() {
        mock.a = null;
        mock.b = String.valueOf(Math.random());
        calcPres.onMinusClicked();
        assertEquals(errors[1],mock.error);
    }
    @Test
    public void firstArgIsNullDivide() {
        mock.a = null;
        mock.b = String.valueOf(Math.random());
        calcPres.onDivideClicked();
        assertEquals(errors[1],mock.error);
    }
    @Test
    public void firstArgIsNullMultiply() {
        mock.a = null;
        mock.b = String.valueOf(Math.random());
        calcPres.onMultiplyClicked();
        assertEquals(errors[1],mock.error);
    }
    @Test
    public void secondArgIsNullPlus() {
        mock.b = null;
        mock.a = String.valueOf(Math.random());
        calcPres.onPlusClicked();
        assertEquals(errors[1],mock.error);
    }
    @Test
    public void secondArgIsNullMinus() {
        mock.b = null;
        mock.a = String.valueOf(Math.random());
        calcPres.onMinusClicked();
        assertEquals(errors[1],mock.error);
    }
    @Test
    public void secondArgIsNullDivide() {
        mock.b = null;
        mock.a = String.valueOf(Math.random());
        calcPres.onDivideClicked();
        assertEquals(errors[1],mock.error);
    }
    @Test
    public void secondArgIsNullMultiply() {
        mock.b = null;
        mock.a = String.valueOf(Math.random());
        calcPres.onMultiplyClicked();
        assertEquals(errors[1],mock.error);
    }
    @Test
    public void divideByZero() {
        mock.a = String.valueOf(Math.random());
        mock.b = String.valueOf(Math.random()*10e-8);
        calcPres.onDivideClicked();
        assertEquals(errors[2],mock.error);
    }
    @Test
    public void firstArgIsNaNPlus() {
        mock.a = "Random string";
        mock.b = String.valueOf(Math.random());
        calcPres.onPlusClicked();
        assertEquals(errors[0],mock.error);
    }
    @Test
    public void firstArgIsNaNMinus() {
        mock.a = "Random string";
        mock.b = String.valueOf(Math.random());
        calcPres.onMinusClicked();
        assertEquals(errors[0],mock.error);
    }
    @Test
    public void firstArgIsNaNDivide() {
        mock.a = "Random string";
        mock.b = String.valueOf(Math.random());
        calcPres.onDivideClicked();
        assertEquals(errors[0],mock.error);
    }
    @Test
    public void firstArgIsNaNMultiply() {
        mock.a = "Random string";
        mock.b = String.valueOf(Math.random());
        calcPres.onMultiplyClicked();
        assertEquals(errors[0],mock.error);
    }
    @Test
    public void secondArgIsNaNPlus() {
        mock.b = "Random string";
        mock.a = String.valueOf(Math.random());
        calcPres.onPlusClicked();
        assertEquals(errors[0],mock.error);
    }
    @Test
    public void secondArgIsNaNMinus() {
        mock.b = "Random string";
        mock.a = String.valueOf(Math.random());
        calcPres.onMinusClicked();
        assertEquals(errors[0],mock.error);
    }
    @Test
    public void secondArgIsNaNDivide() {
        mock.b = "Random string";
        mock.a = String.valueOf(Math.random());
        calcPres.onDivideClicked();
        assertEquals(errors[0],mock.error);
    }
    @Test
    public void secondArgIsNaNMultiply() {
        mock.b = "Random string";
        mock.a = String.valueOf(Math.random());
        calcPres.onMultiplyClicked();
        assertEquals(errors[0],mock.error);
    }
    @RepeatedTest(100)
    public void plusTest() {
        double a = Math.random();
        double b = Math.random();
        mock.a = String.valueOf(a);
        mock.b = String.valueOf(b);
        calcPres.onPlusClicked();
        assertEquals(a+b,mock.result);
    }
    @RepeatedTest(100)
    public void minusTest() {
        double a = Math.random();
        double b = Math.random();
        mock.a = String.valueOf(a);
        mock.b = String.valueOf(b);
        calcPres.onMinusClicked();
        assertEquals(a-b,mock.result);
    }
    @RepeatedTest(100)
    public void divideTest() {
        double a = Math.random();
        double b = Math.random()+10e-7;
        mock.a = String.valueOf(a);
        mock.b = String.valueOf(b);
        calcPres.onDivideClicked();
        assertEquals(a/b,mock.result);
    }
    @RepeatedTest(100)
    public void multiplyTest() {
        double a = Math.random();
        double b = Math.random();
        mock.a = String.valueOf(a);
        mock.b = String.valueOf(b);
        calcPres.onMultiplyClicked();
        assertEquals(a*b,mock.result);
    }
}