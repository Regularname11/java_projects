	


public class car_assignment {

	public static void main(String[] args) {
		Car car2 = new Car();
		Car car1= new Car("Dacia", "Logan", 55);

		car1.printData();
		car1.carAccelerate();
		car1.carbreak();
		car1.printData();
		car2.printData();

	}//end of main


}

class Car {

	//attributes: 
	public String brand;
	public String model;
	public int ammountOfFuel; 

	//default constructor:
	public Car() {
		brand ="volkswagen";
		model= "tiguan TDI";
		ammountOfFuel = 120;
	}

	//parameterized constructor:
	public Car(String brandName, String modelName, int ammountF) {
		brand = brandName;
		model = modelName;
		ammountOfFuel = ammountF;
	}

	//methods:
	public void carbreak(){
		System.out.println("Car is breaking...");
	}

	public void carAccelerate() {
		System.out.println("Car is accelerating...");
		ammountOfFuel--;
	}

	public void brand() {
		System.out.println("Car Name is: " + brand );
	}

	public void model() {
		System.out.println("Car Model is: " + model );
	}

	public void ammountOfFuel(){
		System.out.println("Fuel:  " + ammountOfFuel );
	}

	public void printData() {
		System.out.println("***** CAR *****");
		brand();
		model();
		ammountOfFuel();

	}

}//end of class