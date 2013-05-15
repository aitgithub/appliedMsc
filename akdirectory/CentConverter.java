package WeekTwoLab;

import java.util.Scanner;

public class CentConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount in cents?");
		int cent=sc.nextInt();
		int euro=cent/100;
		int cent2=cent%100;
		System.out.println(euro + " euro "+ cent2 + " cent");
	}

}
