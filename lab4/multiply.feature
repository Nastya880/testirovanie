@calculator
Feature: Mul
	������������ ������
	����������� �������� 2 �����
	�������� �� ���� ����������� ���� �����

@positive @sprint3
Scenario: Multiply two numbers
	�������� ������ ����� 5.0 into the calculator
	�������� ������ ����� 10.0
	When I press multiply
	Then the result should be 50.0 on the screen
