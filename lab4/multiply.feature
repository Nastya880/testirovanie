@calculator
Feature: Mul
	Некорректный пример
	Калькулятор умножает 2 числа
	Проверка на ввод обязательно двух чисел

@positive @sprint3
Scenario: Multiply two numbers
	Вводится первое число 5.0 into the calculator
	Вводится второе число 10.0
	When I press multiply
	Then the result should be 50.0 on the screen
