
public class Main {

	public static void main(String[] args) {
		
		//	Encapsulation = attributes of a class will be hidden or private,
		//					can be accessed only through methods (getters & setters)
		//					you should make attributes private if you don't have a reson to make them public/protected
	
		Car car = new Car("Chevrolet", "Camero", 2021);
		
		car.setMake("Yeet");
		car.setYear(2022);
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
	}
	
}
