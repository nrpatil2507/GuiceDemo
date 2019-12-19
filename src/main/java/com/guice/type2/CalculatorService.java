package com.guice.type2;

import com.google.inject.Inject;

public class CalculatorService {
	@Inject
	private Calculator calculator;

	public int calculate(int a, int b, String opr) {
		if (opr.equalsIgnoreCase("add")) {
			return calculator.addition(a, b);
		} else if (opr.equalsIgnoreCase("sub")) {
			return calculator.substraction(a, b);
		} else if (opr.equalsIgnoreCase("div")) {
			return calculator.division(a, b);
		} else if (opr.equalsIgnoreCase("mul")) {
			return calculator.muliplication(a, b);
		}
		return 0;
	}

}
