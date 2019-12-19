package com.guice.type2;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class CalculatorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Injector injector = Guice.createInjector(new CalculatorModule());
		CalculatorService cr = injector.getInstance(CalculatorService.class);
		System.out.println("addition:-" + cr.calculate(10, 20, "add"));
		System.out.println("multiplication:-" + cr.calculate(10, 20, "mul"));
		System.out.println("division:-" + cr.calculate(100, 20, "div"));
		System.out.println("substraction:-" + cr.calculate(10, 10, "sub"));

	}

}
