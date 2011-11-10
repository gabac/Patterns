package ch.hszt.mdp.strategy.impl;

import ch.hszt.mdp.strategy.Strategy;

public class ConcreteStrategyMultiply implements Strategy{

	public double execute(double a, double b) {
		return a*b;
	}

}
