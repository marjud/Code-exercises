import java.util.ArrayList;

public class Garage {
	
	Bus bus = new Bus();
	Truck truck = new Truck();
	Car car = new Car();
	Motorbike moto = new Motorbike();
	

	public void garage(int billForCar, int billForTruck, int billForBus, int billForMoto) {
		
			
		ArrayList<Vehicle>vehicles = new ArrayList<Vehicle>();
		vehicles.add(car);
		vehicles.add(bus);
		vehicles.add(truck);
		vehicles.add(moto);
		
		for (Vehicle v: vehicles) {
			billForCar = car.engineSize() * car.speed() + v.wheels();
			billForBus = bus.engineSize() * bus.speed() + v.wheels();
			billForMoto = moto.engineSize() * moto.speed() + v.wheels();
			billForTruck = truck.engineSize() * truck.speed() + v.wheels();
		}
	}
	
	private void addRemoveVehicle() {
		
	}
	
	
}
