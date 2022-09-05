package com.skilldistillery.jets.entities;


import java.util.List;


public class AirField {
	// collection of jets
	private List<Jet> jetlist;

	// add jets to array
	public AirField() {

	}
	
	//getters and setters
	public List<Jet> getJetlist() {
		return jetlist;
	}

	public void setJetlist(List<Jet> jetlist) {
		this.jetlist = jetlist;
	}

	@Override
	public String toString() {
		return "AirField [jetlist=" + jetlist + "]";
	}

}
