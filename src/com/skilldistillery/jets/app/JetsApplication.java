package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.JetImpl;

public class JetsApplication {
	private Scanner kb = new Scanner(System.in);
	private AirField airfield = new AirField();
	List<Jet> jetlist = new ArrayList<>();

	public JetsApplication() {

	}

	public static void main(String[] args) {

		JetsApplication japp = new JetsApplication();
		japp.run();
	}

	public void run() {
		String filename = "jets.txt";
		jetlist = readFromFile(filename);
		// airfield.setJetlist(jetlist);

		menuOptions();
		displayUserMenu();
	}
	// }

	// menu options
	public void menuOptions() {
		System.out.println();
		System.out.println("1. List fleet ");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to Fleet");
		System.out.println("8. Remove a jet from Fleet");
		System.out.println("9. Quit");

	}

	// display user menu
	public void displayUserMenu() {
		int choice = kb.nextInt();

		switch (choice) {
		case 1:
			listofFleets();
			break;
		case 2:
			flyJets();
			break;
		case 3:
			fastestjet();
			break;
		case 4:
			longestrange();

			break;
		case 5:
			cargojets();
			break;
		case 6:
			dogfight();
			break;
		default:
			System.out.println("The end");
			break;
		}
	}

	public List<Jet> readFromFile(String filename) {
		List<Jet> jetlist = new ArrayList<>();

		try (BufferedReader bufIn = new BufferedReader(new FileReader(filename))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] list = line.split(", ");
				// String name = list [0];
				String model = list[0];
				double speed = Double.parseDouble(list[1]);
				int range = Integer.parseInt(list[2]);
				long price = Long.parseLong(list[3]);
				Jet j = new JetImpl(model, speed, range, price);
				// jet.add(j);
				System.out.println(j);
				// System.out.println(JetList1[0]);
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		return jetlist;
	}

	public void listofFleets() {
		for (Jet jet : jetlist) {
			System.out.println(jet.toString());
		}
	}

	public void flyJets() {
		for (Jet jet : jetlist) {
			jet.fly();
		}
	}

	public void fastestjet() {
		// TODO Auto-generated method stub

	}

	public void longestrange() {

	}

	public void cargojets() {

	}

	public void dogfight() {

	}

}
