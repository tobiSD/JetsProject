package com.skilldistillery.jets.entities;


import java.util.ArrayList;


public class AirField {
	
	// collection of jets
	private ArrayList<Jet> jetList;
		
	public ArrayList<Jet> getJetList() {
		return jetList;
	}
	
	public void setJetList(ArrayList<Jet> jetList) {
		this.jetList = jetList;
	}

	public AirField() {
		
	}
	
	//display jets for each Jet
	public void jets(ArrayList<Jet> jetList) {
		for(Jet jet : jetList) {
			System.out.println(jet);
			System.out.println();
		}
	}
}