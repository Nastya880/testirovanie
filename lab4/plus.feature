@calculator
Feature: Sum
	������������ ������
	����������� ���������� 2 �����
	�������� �� ���� ����������� ���� �����

@positive @sprint1
Scenario: Add two numbers
	�������� ������ ����� 5.0 into the calculator
	�������� ������ ����� 10.0
	Given I have entered two numbers
	| a | b |
	| 1 | 2 |
	When I press plus
	Then the result should be 15.0 on the screen
