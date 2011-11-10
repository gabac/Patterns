package ch.hszt.mdp.decorator.impl;

import ch.hszt.mdp.decorator.Drink;

public class VodkaRedBull extends VodkaDecorator {
	
	public VodkaRedBull(Drink decoratedVodka) {
		super(decoratedVodka);
	}
	public String getZutat() {
		return super.getZutat() + ", " + "RedBull";
	}

}
