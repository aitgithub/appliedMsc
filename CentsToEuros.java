import java.util.Scanner;


public class CentsToEuros {
	//create scanner object
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//get input from user (int)
		int cents;
		System.out.print("Enter the amount of cents ");
		cents=sc.nextInt();
		int euro =cents/100;
		int newCentValue=cents-(euro*100);
		System.out.println("The euro equivelent of "+cents+" cents is "+euro+" euro and "+newCentValue+" cents");
	}
}	
