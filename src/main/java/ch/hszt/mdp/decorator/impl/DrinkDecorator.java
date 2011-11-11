package ch.hszt.mdp.decorator.impl;

import ch.hszt.mdp.decorator.Drink;

public class DrinkDecorator implements Drink{
	
	Drink decoratedDrink;
	
	public DrinkDecorator(Drink decoratedDrink) {
		this.decoratedDrink = decoratedDrink;
	}

	public String getZutat() {
		return decoratedDrink.getZutat();
	}
}
