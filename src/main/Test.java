package main;

import models.Driver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d1 = new Driver();
//		drive four times
		d1.setDrive(1);
		d1.setDrive(1);
		d1.setDrive(1);
		d1.setDrive(1);
//		boost once
		d1.setBoost(3);
//		refuel three times
		d1.setRefuel(2);
		d1.setRefuel(2);
		d1.setRefuel(2);
		d1.setRefuel(2);
//		added game over message when gas reaches 0
		d1.setDrive(1);
//		boost once
		d1.setBoost(3);
		d1.setBoost(3);
		d1.setBoost(3);
		d1.setBoost(3);
//		pushes out of gas for boost message
//		d1.setBoost(3);
		d1.setDrive(1);
//		pushes out of gas game over message
//		d1.setDrive(1);
		d1.setRefuel(2);
		d1.setRefuel(2);
		d1.setRefuel(2);
		d1.setRefuel(2);
		
		
	}

}
