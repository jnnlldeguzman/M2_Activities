package Individual;

public class S3Car {
	
	String brand;
	String model;
	int year;
	
	public S3Car() {
//		System.out.println ();
	}
	
	
	
	public S3Car (String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		
	}
	
	
	
	public void displayInfo1() {
		System.out.println("Car Brand: " + brand);
		System.out.println("Car Model: " + model);
		System.out.println("Car Year: " + year);
	}
	
	public void displayInfo2() {
		System.out.println("Car Brand: " + brand);
		System.out.println("Car Model: " + model);
		System.out.println("Car Year: " + year);
	}
	

}
