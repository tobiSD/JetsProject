package com.skilldistillery.jets.entities;

//it is abstract
public abstract class Jet {

		//fields
		private String model;
		private double speed;
		private int range;
		private long price;
		
		//no argument constructor
		public Jet() {
			
		}
		
		//constructor
		public Jet(String model, double speed, int range, long price) {
			super();
			this.model = model;
			this.speed = speed;
			this.range = range;
			this.price = price;
		}
		
		//getters and setters
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
		
		//fly method 
		public void fly() {
			//print out the details of jets 
			//calculate jetFlyTime
			double jetFlyTime = this.range()/this.speed;
			System.out.println(this.model+"can fly"+jetFlyTime+"before running out of fuel");
		}
		
		//getSpeed method 
		public double getSpeedInMPH(){
			double calMach = 0;
			//calculate speed in MPH or mach
			return calMach;
			
		}

		//to string 
		@Override
		public String toString() {
			return "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
		}
		
		
		

		
		
}
