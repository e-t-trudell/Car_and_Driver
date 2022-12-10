package models;

public class Car {
	int gas = 10;

	public int getGas() {
		if(gas ==  0) {
			System.out.println("Game Over!");
		}
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}
}
