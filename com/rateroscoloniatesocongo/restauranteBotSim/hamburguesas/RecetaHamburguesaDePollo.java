package com.rateroscoloniatesocongo.restauranteBotSim.hamburguesas;

public class RecetaHamburguesaDePollo extends RecetaHamburguesa{

	@Override
	public void prepararCarne() {
		System.out.println("Poniendo carne de pechuga de pollo");
	}

	@Override
	public void ponerQueso() {
		System.out.println("Poniendo queso crema");
	}
}
