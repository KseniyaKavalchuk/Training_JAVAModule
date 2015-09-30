package epam.training.cdp.calculator;

import java.util.Scanner;

public class Runner {
	static double x;
	static double y;
	
	public static void setupXY (Scanner scanner){
		System.out.println("Please enter 1st value: ");
		x = scanner.nextDouble();
		System.out.println("Please enter 2nd value: ");
		y = scanner.nextDouble();
	}
	
	public static void main(String[] args) {
		boolean repeat = true;
		
		while(repeat) {
			
			System.out.println("Please, enter number of menu:");
			System.out.println("1 - Summ");
			System.out.println("2 - Subtraction");
			System.out.println("3 - Multiplication");
			System.out.println("4 - Division");
			System.out.println("0 - Exit");
			
			Scanner scanner = new Scanner(System.in);
			int action = scanner.nextInt();
			
			switch(action) {
			case 0:
				repeat = false;
				System.out.println("Completed");
				break;
			case 1:
				setupXY(scanner);
				System.out.println("Summ= " + calculateValue.summ(x, y));
				break;
			case 2:
				setupXY(scanner);
				System.out.println("Subtraction= " + calculateValue.subtraction(x, y));
				break;
			case 3:
				setupXY(scanner);
				System.out.println("Multiplication= " + calculateValue.multiplication(x, y));
				break;
			case 4:
				setupXY(scanner);
				System.out.println("Division= " + calculateValue.division(x, y));
				break;
				
				default:
					System.out.println("Incorrect value! Please try numbers from 0 to 4");
					break;
			}
			
		} 

	}

}
