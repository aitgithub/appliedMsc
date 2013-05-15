import java.util.Scanner;


public class MoneyConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter monetary value in cents");
		Scanner sc = new Scanner(System.in);
		
		double cents = sc.nextDouble();
		double euro = cents/100;
		System.out.println("Cents "+cents+" = "+euro+ " euro");
	}

}
