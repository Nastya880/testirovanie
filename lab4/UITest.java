package main.test.ru.miet.testing;

import main.java.ru.miet.testing.Main;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainMock extends Main {
    public MainMock() {super();}
    public String error;
    @Override
    public void displayError(String message) {
        error = message;
    }
}


class UITest {
    private static MainMock app;
    private static Robot robot;
    private static double a,b;
    private final String[] errors = {"not number", "Enter number", "oooo..../0 :("};
    @BeforeAll
    public static void init() {
        app = new MainMock();
        app.setVisible(true);
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        a = Math.random();
        b = Math.random();
    }

    public void click(JButton button, int dx, int dy) throws InterruptedException {
        Point p = button.getLocationOnScreen();
        int y =  button.getBounds().height / 2;
        int x =  button.getBounds().width / 2;
       // robot.mouseMove(-1000,-1000);
        //robot.mouseMove(p.x-dx,p.y-dy);        
        robot.mouseMove(p.x + x, p.y + y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(10);
    }

    private void setA(double a) throws InterruptedException {
        app.inputA.setText(Double.toString(a));
        Thread.sleep(20);
    }
    private void setB(double b) throws InterruptedException {
        app.inputB.setText(Double.toString(b));
        Thread.sleep(20);
    }
    @Test
    public void testPlus() throws InterruptedException {
    	setB(b);
        setA(a);
        click(app.plus, 10, 10);
        assertEquals(Double.toString(a + b), app.output.getText());
        Thread.sleep(100);
    }
    @Test
    public void testMinus() throws InterruptedException {
    	setA(a);
    	setB(b);
        click(app.minus,20, 20);
        assertEquals(Double.toString(a - b), app.output.getText());
        Thread.sleep(100);
    }
    @Test
    public void testMult() throws InterruptedException {
    	setA(a);
    	setB(b);
        click(app.multiply, 50, 50);
        assertEquals(Double.toString(a * b), app.output.getText());
        Thread.sleep(100);
    }
    @Test
    public void testDiv() throws InterruptedException {
    	setA(a);
    	setB(b+10e-8);
        click(app.divide, 50,100);
        assertEquals(Double.toString(a / (b+10e-8)), app.output.getText());
        Thread.sleep(100);
    }
    @Test
    public void testNullPlusA() throws InterruptedException {
        app.inputA.setText(null);
        Thread.sleep(100);
        setB(b);
        click(app.plus, 10, 10);
        assertEquals(app.error,errors[0]);
    }
    @Test
    public void testNullMinusA() throws InterruptedException {
        app.inputA.setText(null);
        Thread.sleep(100);
        setB(b);
        click(app.minus, 20, 20);
        assertEquals(app.error,errors[0]);
    }
    @Test
    public void testNullMultA() throws InterruptedException {
        app.inputA.setText(null);
        Thread.sleep(100);
        setB(b);
        click(app.multiply, 50, 50);
        assertEquals(app.error,errors[0]);
    }
    @Test
    public void testNullDivA() throws InterruptedException {
        app.inputA.setText(null);
        Thread.sleep(100);
        setB(b);
        click(app.divide, 50, 100);
        assertEquals(app.error,errors[0]);
    }
    @Test
    public void testNullPlusB() throws InterruptedException {
        app.inputB.setText(null);
        Thread.sleep(100);
        setA(b);
        click(app.plus, 10, 10);
        assertEquals(app.error,errors[0]);
    }
    @Test
    public void testNullMinusB() throws InterruptedException {
        app.inputB.setText(null);
        Thread.sleep(100);
        setA(b);
        click(app.minus, 20, 20);
        assertEquals(app.error,errors[0]);
    }
    @Test
    public void testNullMultB() throws InterruptedException {
        app.inputB.setText(null);
        Thread.sleep(100);
        setA(b);
        click(app.multiply, 50, 50);
        assertEquals(app.error,errors[0]);
    }
    @Test
    public void testNullDivB() throws InterruptedException {
        app.inputB.setText(null);
        Thread.sleep(100);
        setA(b);
        click(app.divide, 50, 100);
        assertEquals(app.error,errors[0]);
    }

    @Test
    public void testNSPlusA() throws InterruptedException {
        app.inputA.setText("Random");
        Thread.sleep(100);
        setB(b);
        click(app.plus, 10, 10);
        assertEquals(app.error,errors[0]);
    }
    @Test
    public void testNSMinusA() throws InterruptedException {
        app.inputA.setText("Random");
        Thread.sleep(100);
        setB(b);
        click(app.minus, 20, 20);
        assertEquals(app.error,errors[0]);
    }
    @Test
    public void testNSMultA() throws InterruptedException {
        app.inputA.setText("Random");
        Thread.sleep(100);
        setB(b);
        click(app.multiply, 50, 50);
        assertEquals(app.error,errors[0]);
    }
    @Test
    public void testNSDivA() throws InterruptedException {
        app.inputA.setText("Random");
        Thread.sleep(100);
        setB(b);
        click(app.divide, 50, 100);
        assertEquals(app.error,errors[0]);
    }
    @Test
    public void testNSPlusB() throws InterruptedException {
        app.inputB.setText("Random");
        Thread.sleep(100);
        setA(b);
        click(app.plus, 10, 10);
        assertEquals(app.error,errors[0]);
    }
    @Test
    public void testNSMinusB() throws InterruptedException {
        app.inputB.setText("Random");
        Thread.sleep(100);
        setA(b);
        click(app.minus, 20, 20);
        assertEquals(app.error,errors[0]);
    }
    @Test
    public void testNSMultB() throws InterruptedException {
        app.inputB.setText("Random");
        Thread.sleep(100);
        setA(b);
        click(app.multiply, 50, 50);
        assertEquals(app.error,errors[0]);
    }
    @Test
    public void testNSDivB() throws InterruptedException {
        app.inputB.setText("Random");
        Thread.sleep(100);
        setA(b);
        click(app.divide, 50, 100);
        assertEquals(app.error,errors[0]);
    }
    @Test
    public void testDivByZero() throws  InterruptedException {
        app.inputB.setText("0");
        Thread.sleep(10);
        setA(a);
        click(app.divide,50,100);
      //  assertEquals(app.error,errors[2]);
    }
}