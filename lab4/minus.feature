@calculator
Feature: Sub
	Некорректный пример
	Калькулятор вычитает 2 числа
	Проверка на ввод обязательно двух чисел

@positive @sprint2
Scenario: Subtract two numbers
	Вводится первое число 5.0 into the calculator
	Вводится второе число 10.0
	When I press minus
	Then the result should be -5.0 on the screen
