@calculator
Feature: Div
	Некорректный пример
	Калькулятор делит 2 числа
	Проверка на ввод обязательно двух чисел

@positive @sprint2
Scenario: Subtract two numbers
	Вводится первое число 5.0 into the calculator
	Вводится второе число 10.0
	When I press divide
	Then the result should be 0.5 on the screen
