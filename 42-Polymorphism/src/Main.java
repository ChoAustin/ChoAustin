
public class Main {

	public static void main(String[] args) {
		// polymorphism =	greek word for poly-"many", morph-"form"
		//					the ability of an object to identify as more than one type
		//					when storing multiple objects, if its not the same type of vehicle it can be in a list together;
		//					however, if you recreate it to be broader, in this cause as "Vehicle[] racers =" all objects can be together since they share 
		//					a common aspect which is extending from vehicle.
		
		Car car = new Car();
		Bicycle bike = new Bicycle();
		Boat boat = new Boat();
		
		Vehicle[] racers = {car, bike, boat};
		
		for(Vehicle x : racers) {
			x.go();
		}
	}

}
