package exercises;
import java.util.*;


public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number:");
		double num1= scan.nextDouble();
		System.out.print("Enter second number:");
		double num2= scan.nextDouble();

		System.out.println("Mathematical operation\n------------------------------");
		System.out.println("1 - Add\n2 - Subtract\n3 - Multiply\n4 - Divide\n-----------------------------");	
		System.out.println("Enter your preference:");
		
		
		int option= scan.nextInt();
		
		switch (option) {
		case 1: System.out.println(num1+num2);
		break;
		case 2: System.out.println(num1-num2);
		break;
		case 3: System.out.println(num1*num2);
		break;
		case 4: System.out.println(num1/num2);
		break;
		default: System.out.println("Invalid response");
		break;
		}
		
		scan.close();
	}

}
