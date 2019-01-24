
public class Bus extends Vehicle{

	@Override
	public int wheels() {
		return 8;
	}

	@Override
	public int engineSize() {
		return 5000;
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
		return 40;				
	}

	@Override
	public int doors() {
		return 2;
	}
	
	public boolean canCarryMoreThan5Passengers() {
		return true;
	}

	@Override
	public double price() {
		// TODO Auto-generated method stub
		return 656;
	}

}
