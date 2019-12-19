package com.guice.type1;

import com.google.inject.Singleton;

@Singleton
public class CalculatorImpl implements Calculator {
	@Override
	public int addition(int a, int b) {
		return a + b;
	}

	@Override
	public int muliplication(int a, int b) {
		return a * b;
	}

	@Override
	public int division(int a, int b) {
		return a / b;
	}

	@Override
	public int substraction(int a, int b) {
		return a - b;
	}

}
