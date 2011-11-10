package ch.hszt.mdp.strategy.impl;

import ch.hszt.mdp.strategy.Strategy;

public class StrategyClient {
	Strategy strategy;

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public double performOperation(double a, double b) {
		return strategy.execute(a, b);
	}
}
