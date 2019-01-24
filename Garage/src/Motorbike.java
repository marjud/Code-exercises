
public class Motorbike extends Vehicle {

	@Override
	public int wheels() {
		return 2;
	}

	@Override
	public int engineSize() {
		return 1000;
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
		return 100;
	}

	@Override
	public int doors() {
		return 0;
	}
	public boolean protectionRequired() {
		return true; 
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 65;
	}

}
