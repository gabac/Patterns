package ch.hszt.mdp.decorator.impl;

import ch.hszt.mdp.decorator.Drink;

public class VodkaDecorator implements Drink{
	
	Drink decoratedDrink;
	
	public VodkaDecorator(Drink decoratedDrink) {
		this.decoratedDrink = decoratedDrink;
	}

	public String getZutat() {
		return decoratedDrink.getZutat();
	}
}
