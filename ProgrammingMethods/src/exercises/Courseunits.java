package exercises;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Courseunits {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("How many course units?");
	int n= scan.nextInt();
	int mark;
	String course;
	
	Queue<String> courseunits= new LinkedList<String>();
	Queue<Integer> final_mark = new LinkedList<Integer>();
	Queue<Double> grade_point = new LinkedList<Double>();
	
	for(int i=1; i<=n; i++) {
		System.out.println("Course "+i+" :");
		course=scan.next();
		courseunits.add(course);
		
		System.out.println("Final mark:");
		mark=scan.nextInt();
		
		double gp=0;
		if(mark>=80) {
		gp=5.0;
	}
		else if((mark>=75) && (mark<80)) {
		gp=4.5;
		}
		else if((mark>=70) && (mark<75)) {
			gp = 4.0;
		}
		else if ((mark>=65) && (mark<70)) {
			gp=3.5;	
		}
		else if ((mark>=60) && (mark<65)) {
			gp=3.0;
		}
		else if ((mark>=55) && (mark<60)) {
			gp=2.5;
		}
		else if ((mark>=50) && (mark<55)) {
			gp=2.0;
		}
		else if (mark<50){
			gp=0;
		}
		else 
			System.out.println("Invalid marks");
		final_mark.add(mark);
		grade_point.add(gp);
	}
	for(int j=1; j<=n;j++) {
	System.out.println(courseunits.remove()+"\t"+final_mark.remove()+"\t"+grade_point.remove());
	}
	
	scan.close();
	}

}
