
public class Truck extends Vehicle{

	@Override
	public int wheels() {
		return 6;
	}

	@Override
	public int engineSize() {
		return 2100;
	}

	@Override
	public boolean turbo() {
		return false;
	}

	@Override
	public String fuelType() {
		return ("Diesel");
	}

	@Override
	public int speed() {
		return 70;
	}

	@Override
	public int doors() {
		return 5;
	}
	public int horsePower() {
		return 346; 
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 65;
	}

}
