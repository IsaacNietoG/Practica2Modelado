package com.rateroscoloniatesocongo.restauranteBotSim.hamburguesas;

public class RecetaHamburguesaTripleAmericana extends RecetaHamburguesa{

	@Override
	public void prepararCarne() {
		System.out.println("Poniendo triple carne con tocino");
	}

	@Override
	public void ponerQueso() {
		System.out.println("Poniendo triple queso cheddar y monterrey jack");
	}
}
