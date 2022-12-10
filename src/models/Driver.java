package models;

public class Driver extends Car{
	int drive = (-1);
	int boost = (-3);
	int refuel = 2;
//	getters
	public int getDrive() {
		return drive;
	}
	public int getBoost() {
		return boost;
	}
	public int getRefuel() {
		return refuel;
	}
//	setters
	public void setDrive(int drive) {
		this.drive = drive;
		gas -= drive;
		System.out.println("Driving: "+this.getGas());
	}
	
	public void setBoost(int boost) {
		this.boost = boost;
		if(gas < 3) {
			System.out.println("Need more gas to boost");
		}
		else {
			gas -= boost;
			System.out.println("Boosting: "+this.getGas());
		}
	}
	
	public void setRefuel(int refuel) {
		this.refuel = refuel;
		if(gas == 8) {
			System.out.println("Gas tank full");
		}
		else {
			gas += refuel;
			System.out.println("Refueling: "+this.getGas());
		}
	}
	
	
}
