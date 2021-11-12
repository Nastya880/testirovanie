@calculator
Feature: Sum
	Некорректный пример
	Калькулятор складывает 2 числа
	Проверка на ввод обязательно двух чисел

@positive @sprint1
Scenario: Add two numbers
	Вводится первое число 5.0 into the calculator
	Вводится второе число 10.0
	Given I have entered two numbers
	| a | b |
	| 1 | 2 |
	When I press plus
	Then the result should be 15.0 on the screen
