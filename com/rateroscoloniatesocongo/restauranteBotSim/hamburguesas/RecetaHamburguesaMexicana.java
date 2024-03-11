package com.rateroscoloniatesocongo.restauranteBotSim.hamburguesas;

public class RecetaHamburguesaMexicana extends RecetaHamburguesa{

	@Override
	public void ponerAderezo() {
		System.out.println("Poniendo guacamole");
	}

	@Override
	public void prepararCarne() {
		System.out.println("Poniendo carne selecta de Monterrey");
	}

	@Override
	public void ponerQueso() {
		System.out.println("Poniendo queso Oaxaca");
	}
}
