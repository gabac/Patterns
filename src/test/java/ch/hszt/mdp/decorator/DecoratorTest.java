package ch.hszt.mdp.decorator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import ch.hszt.mdp.decorator.impl.Vodka;
import ch.hszt.mdp.decorator.impl.RedBull;

public class DecoratorTest {

	Drink drink;

	@Before
	public void init() {
		drink = new Vodka();
	}

	@Test
	public void vodka() {
		assertEquals("Vodka", drink.getZutat());
	}

	@Test
	public void vodkaRedBull() {

		drink = new RedBull(drink);

		assertEquals("Vodka, RedBull", drink.getZutat());
	}
}
