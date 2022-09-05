package com.skilldistillery.jets.entities;

//implementation class
public class FighterJet extends Jet implements CombatReady {

	// since it extends jet it inherits the field from jet
	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	// implements flight method declared in CombatReady interface class
	@Override
	public void fight() {
		System.out.println(getModel()+"is fighting");

}}

