package Individual;

//import java.util.Scanner;

public class Seatwork3 {

	public static void main(String[] args) {
		
		
		//my first car
		S3Car car1 = new S3Car();
		car1.brand = "BMW";
		car1.model = "M5";
		car1.year = 2020;
		
		
		//second car
		S3Car car2 = new S3Car ("honda", "civic", 2025);
		
		System.out.println("===Car #01===");
		car1.displayInfo1();
		System.out.println("=============");
		
		System.out.println(" ");
		
		System.out.println("===Car #02===");
		car2.displayInfo2();		
		System.out.println("=============");				

	}

}
