package com.guice.type1;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class CalculatorClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Injector injector = Guice.createInjector(new CalculatorModule());
		Calculator c = injector.getInstance(Calculator.class);
		System.out.println(c);
		System.out.println("addition:-" + c.addition(10, 20));
		System.out.println("substraction:-" + c.substraction(200, 20));
		System.out.println("division:-" + c.division(100, 20));
		System.out.println("multiplication:-" + c.muliplication(10, 10));
		Calculator c1 = injector.getInstance(Calculator.class);
		System.out.println(c1);
	}

}
