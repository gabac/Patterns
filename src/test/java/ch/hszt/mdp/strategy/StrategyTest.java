package ch.hszt.mdp.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ch.hszt.mdp.strategy.impl.ConcreteStrategyAdd;
import ch.hszt.mdp.strategy.impl.ConcreteStrategyMultiply;
import ch.hszt.mdp.strategy.impl.StrategyClient;

public class StrategyTest {

	StrategyClient strategyClient;

	@Before
	public void init() {
		strategyClient = new StrategyClient();
	}

	@Test
	public void add() {
		Strategy add = new ConcreteStrategyAdd();

		strategyClient.setStrategy(add);

		assertEquals(14, strategyClient.performOperation(5, 9), 0);
	}

	@Test
	public void multiply() {
		Strategy multiply = new ConcreteStrategyMultiply();

		strategyClient.setStrategy(multiply);

		assertEquals(45, strategyClient.performOperation(5, 9), 0);
	}
}
