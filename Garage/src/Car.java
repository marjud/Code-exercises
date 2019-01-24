
public class Car extends Vehicle {
	
	int size;
	
	public Car() {
		size = 100;
	}

	@Override
	public int wheels() {
		return 4;
	}

	@Override
	public int engineSize() {
		return 1400;
	}

	@Override
	public boolean turbo() {
		return true;
	}

	@Override
	public String fuelType() {
		return ("Petrol");
	}

	@Override
	public int speed() {
		return 90;
	}

	@Override
	public int doors() {
		return 3;
	}
	
	public String isHybrid(String fuelType) {
		fuelType = fuelType();
		if (fuelType.equals("Petrol") && fuelType.equals("Electric")) {
			fuelType = ("Hybrid");
		}
		return fuelType;
	}

	@Override
	public double price() {
		return 55;
	}
	
}
