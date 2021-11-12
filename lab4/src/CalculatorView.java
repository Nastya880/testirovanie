package main.java.ru.miet.testing;

public interface CalculatorView {

    /**
     * ���������� ��������� ����������
     */
    void printResult(double result);

    /**
     * ���������� ������, �������� ������� �� 0, ������ ��������� � ������
     */
    void displayError(String message);

    /**
     * ���������� ��������, ��������� � ���� ������� ���������
     */
    String getFirstArgumentAsString();

    /**
     * ���������� ��������, ��������� � ���� ������� ���������
     */
    String getSecondArgumentAsString();
}
