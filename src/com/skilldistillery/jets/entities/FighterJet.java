package com.skilldistillery.jets.entities;

//implementation class
public class FighterJet extends Jet implements CombatReady {
	

	public FighterJet() {
		super();
	}

	// since it extends jet it inherits the field from jet
	public FighterJet(String name, String model, double speed, int range, long price) {
		super(name, model, speed, range, price);
	}

	public void DogFight() {
		System.out.println("DOGFIGHT");
	}

	// implements flight method declared in CombatReady interface class
	@Override
	public void fight() {
		// System.out.println(getModel() + "is fighting");

	}
}
