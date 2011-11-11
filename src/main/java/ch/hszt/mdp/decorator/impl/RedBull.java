package ch.hszt.mdp.decorator.impl;

import ch.hszt.mdp.decorator.Drink;

public class RedBull extends DrinkDecorator {

	public RedBull(Drink decoratedVodka) {
		super(decoratedVodka);
	}

	public String getZutat() {
		return super.getZutat() + ", " + "RedBull";
	}
}
