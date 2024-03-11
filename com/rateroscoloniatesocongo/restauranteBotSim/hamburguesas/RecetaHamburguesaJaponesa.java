package com.rateroscoloniatesocongo.restauranteBotSim.hamburguesas;

public class RecetaHamburguesaJaponesa extends RecetaHamburguesa{

	
	@Override
	public void ponerPan() {
		System.out.println("Poniendo pan con tinta de calamar");
	}

	@Override
	public void ponerAderezo() {
		System.out.println("Poniendo salsas japonesas");
	}

	@Override
	public void prepararCarne() {
		System.out.println("Poniendo carne wuagyu japonesa");
	}

	@Override
	public void ponerQueso() {
		System.out.println("Poniendo queso blanco");
	}
}
