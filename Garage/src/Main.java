import java.util.ArrayList;

public class Main {
	
	static Bus b = new Bus();
	static Truck t = new Truck();
	static Car c = new Car();
	static Motorbike m = new Motorbike();
	static int billForCar; 
	static int billForTruck;
	static int billForBus;
	static int billForMoto;
	public static void main(String[] args) {

		ArrayList<Vehicle>vehicles = new ArrayList<Vehicle>();
		vehicles.add(c);
		vehicles.add(b);
		vehicles.add(t);
		vehicles.add(m);
		
		System.out.println(c.engineSize());
		
		for (Vehicle v: vehicles) {
			billForCar = c.engineSize() * c.speed() + v.wheels();
			billForBus = b.engineSize() * b.speed() + v.wheels();
			billForMoto = m.engineSize() * m.speed() + v.wheels();
			billForTruck = t.engineSize() * t.speed() + v.wheels();
			
			System.out.println(billForCar);
			
		}
	}
}
