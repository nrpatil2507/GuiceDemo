package com.guice.type1;

import com.google.inject.AbstractModule;

public class CalculatorModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Calculator.class).to(CalculatorImpl.class);
		// it will create only one object of class
		// bind(Calculator.class).to(CalculatorImpl.class).in(Singleton.class);
		// bind(Calculator.class).to(CalculatorImpl.class).in(Scopes.SINGLETON);
		// by default singleton
		// bind(Calculator.class).toInstance(new CalculatorImpl());
	}
}
