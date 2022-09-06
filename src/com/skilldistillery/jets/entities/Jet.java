package com.skilldistillery.jets.entities;

//import java.util.Objects;
//
////it is abstract
//public abstract class Jet {
//
//	// fields
//	private String model;
//	private double speed;
//	private int range;
//	private long price;
//
//	// no argument constructor
//	public Jet() {
//
//	}
//
//	// constructor
//	public Jet(String model, double speed, int range, long price) {
//		//super();
//		this.model = model;
//		this.speed = speed;
//		this.range = range;
//		this.price = price;
//	}
//
//	// getters and setters
//	public String getModel() {
//		return model;
//	}
//
//	public void setModel(String model) {
//		this.model = model;
//	}
//
//	public double getSpeed() {
//		return speed;
//	}
//
//	public void setSpeed(double speed) {
//		this.speed = speed;
//	}
//
//	public int getRange() {
//		return range;
//	}
//
//	public void setRange(int range) {
//		this.range = range;
//	}
//
//	public long getPrice() {
//		return price;
//	}
//
//	public void setPrice(long price) {
//		this.price = price;
//	}
//
//	// fly method
//	public void fly() {
//		// print out the details of jets
//		// calculate jetFlyTime
//		double jetFlyTime = this.range / this.speed;
//		System.out.println(this.model + "can fly " + jetFlyTime + "before running out of fuel");
//	}
//
//	// getSpeed method
//	public double getSpeedInMPH() {
//		// calculate speed in MPH or mach
//		return 0;
//
//	}
//
//	// to string
//	@Override
//	public String toString() {
//		return "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(model, price, range, speed);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Jet other = (Jet) obj;
//		return Objects.equals(model, other.model) && price == other.price && range == other.range
//				&& Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed);
//	}
//
//	
//}

import java.util.Objects;



public abstract class Jet {
	
	public Jet(String name, String model, double speed, int range, long price) {
		this.name = name;
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public Jet() {
		super();
	}
	

	private String name;
	private String model;
	private double speed;
	private int range;
	private long price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jet [name=" + name + ", model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(model, price, range, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		return Objects.equals(model, other.model) && price == other.price && range == other.range
				&& Double.doubleToLongBits(speed) == Double.doubleToLongBits(other.speed);
	}

	public double fly() {
		double time = range / speed;
		return time;
	}
	
}
