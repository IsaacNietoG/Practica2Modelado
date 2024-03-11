package com.rateroscoloniatesocongo.restauranteBotSim.hamburguesas;

public class RecetaHamburguesaVegana extends RecetaHamburguesa{

	@Override
	public void prepararCarne() {
		System.out.println("Poniendo carne a base de champiañones y plantas");
	}

	@Override
	public void ponerQueso() {
		System.out.println("Poniendo tofu");
	}
}
