@calculator
Feature: Sub
	������������ ������
	����������� �������� 2 �����
	�������� �� ���� ����������� ���� �����

@positive @sprint2
Scenario: Subtract two numbers
	�������� ������ ����� 5.0 into the calculator
	�������� ������ ����� 10.0
	When I press minus
	Then the result should be -5.0 on the screen
