package com.skilldistillery.jets.entities;

public class CargoJet extends Jet implements CargoCarrier {

	// since it extends jet it inherits the field from jet
	public CargoJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	// implements loadCrgo method declared in CargoCarrier
	@Override
	public void loadCargo() {
		System.out.println("Loading cargo is loading"+this.getModel());
	}

}
