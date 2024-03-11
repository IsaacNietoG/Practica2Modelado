package com.rateroscoloniatesocongo.restauranteBotSim.hamburguesas;

public class RecetaHamburguesaItaliana extends RecetaHamburguesa{

	@Override
	public void ponerAderezo() {
		System.out.println("Poniendo salsa de tomate en el pan");
	}

	@Override
	public void prepararCarne() {
		System.out.println("Poniendo carne de res");
	}

	@Override
	public void ponerQueso() {
		System.out.println("Poniendo queso mozarella");
	}
}
