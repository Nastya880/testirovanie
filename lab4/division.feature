@calculator
Feature: Div
	������������ ������
	����������� ����� 2 �����
	�������� �� ���� ����������� ���� �����

@positive @sprint2
Scenario: Subtract two numbers
	�������� ������ ����� 5.0 into the calculator
	�������� ������ ����� 10.0
	When I press divide
	Then the result should be 0.5 on the screen
