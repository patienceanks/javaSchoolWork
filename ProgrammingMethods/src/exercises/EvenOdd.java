package exercises;
import java.util.*;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter an integer:");
		Scanner scan = new Scanner(System.in);
		int number= scan.nextInt();
		
		if (number%2==0) {
			System.out.println("Number is even");
		}
		else 
			System.out.println("Number is odd");
		scan.close();
	}

}
