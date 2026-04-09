package pack01;

public class Truck extends Car {

	public Truck() {
	}

	public Truck(int maxWeight, double oilTankSize, double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}

	public double getEfficiency() {
		//
		return 0;
	}
	
	public void moving(int distance) {
		//
	}
	private double calcOil(int distance) {
		//
		return 0;
	}
	
	public int getCost(int distance) {
		//
		return 0;
	}

	@Override
	public String toString() {
		return "Truck [getEfficiency()=" + getEfficiency() + "]";
	}
	
	
	
	
	
	
}
