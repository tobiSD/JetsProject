package com.skilldistillery.jets.app;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.CargoJet;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.JetImpl;

public class JetsApplication {

	public static void main(String[] args) {
		JetsApplication japp = new JetsApplication();
		ArrayList<Jet> jetList = new ArrayList<Jet>();
		japp.readFromFile(jetList);
		AirField airfield2 = new AirField();
		japp.menuOptions(airfield2, jetList);
	}

	public void menuOptions(AirField airfield, ArrayList<Jet> jetList) {
		Scanner kb = new Scanner(System.in);
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

		int choice = kb.nextInt();

		switch (choice) {
		case 1:
			airfield.jets(jetList);
			break;
		case 2:
			flyJets(airfield, jetList);
			break;
		case 3:
			fastestJet(airfield, jetList);
			break;
		case 4:
			longestrange(airfield, jetList);
			break;
		case 5:
			cargojets(airfield, jetList);
			break;
		case 6:
			dogfight(airfield, jetList);
			break;
		case 7:
			addjet(airfield, jetList, kb);
			break;
//		case 8:
//			removejet();
//			break;
		case 9:
			System.out.println("Quit");
			break;
		default:
			System.out.println("The end");
			break;
		}
	}

	public void fastestJet(AirField airfield, ArrayList<Jet> jetList) {
		Jet fastestJet = jetList.get(0);
		for (Jet jet : jetList) {
			if (fastestJet.getSpeed() < jet.getSpeed())
				fastestJet = jet;
		}
		System.out.println(" " + fastestJet.toString());
	}

	public void flyJets(AirField airfield, ArrayList<Jet> getjetList) {

		for (Jet jet : getjetList) {
			jet.fly();
		}
	}

	public void longestrange(AirField airfield, ArrayList<Jet> jetListt) {
		Jet longestrange = jetListt.get(0);
		for (Jet jet : jetListt) {
			if (longestrange.getRange() < jet.getRange())
				longestrange = jet;
		}
		System.out.println(" " + longestrange.toString());
	}

	public void cargojets(AirField airfield, ArrayList<Jet> jetListt) {
		for (Jet jet : jetListt) {
			if (jet instanceof CargoJet) {
				((CargoJet) jet).loadCargo();
			}
		}
	}

	public void dogfight(AirField airfield, ArrayList<Jet> jetListt) {
		for (Jet jet : jetListt) {
			if (jet instanceof FighterJet) {
				((FighterJet) jet).DogFight();
			}
		}
	}

	public void addjet(AirField airfield, ArrayList<Jet> jetList, Scanner kb) {
		System.out.println("Add your jet");
		System.out.println("1.FighterJet\n2.CargoJet");
		String Input = kb.nextLine();
		kb.nextLine();
		System.out.print("What is the name");
		String name = kb.nextLine();
		System.out.println("model:");
		String model = kb.nextLine();
		System.out.println("speed:");
		double speed = kb.nextDouble();
		System.out.println("range:");
		int range = kb.nextInt();
		System.out.println("price");
		long price = kb.nextLong();
		switch (Input) {
		case "1":
			FighterJet f = new FighterJet(name, model, speed, range, price);
			jetList.add(f);
			break;
		case "2":
			CargoJet c = new CargoJet(name, model, speed, range, price);
			jetList.add(c);
			break;
		}
	}
	
//	public removejet(AirField airfield, ArrayList<Jet> jetList, Scanner kb) {
//		System.out.println("Enter name of jet to remove");
//		String name = kb.nextLine();
//		for (Jet jet : jetlist) {
//			
//		}
//		
//	}

	private void readFromFile(ArrayList<Jet> jetList) {

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] list = line.split(", ");
				String name = list[0];
				String model = list[1];
				double speed = Double.parseDouble(list[2]);
				int range = Integer.parseInt(list[3]);
				long price = Long.parseLong(list[4]);
				Jet j = new JetImpl(name, model, speed, range, price);
				System.out.println(j);

			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}