package com.rateroscoloniatesocongo.restauranteBotSim.hamburguesas;

public class RecetaHamburguesaAmericana extends RecetaHamburguesa{

	@Override
	public void prepararCarne() {
		System.out.println("Poniendo doble carne de res");
	}

	@Override
	public void ponerQueso() {
		System.out.println("Poniendo queso cheddar");
	}
}
