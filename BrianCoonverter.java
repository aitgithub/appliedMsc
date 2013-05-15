
import java.util.Scanner;

public class BrianCoonvertor {

	public static void main(String[] args) {
		System.out.println("Enter cent amount (Greater than 0)");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		if (i >= 0) {

			int euro = (i / 100);
			int cent = (i % 100);

			System.out.println(euro + " Euro and " + cent + " cent");
		}
		else
			System.out.println("Invalid amount entered!");

	}
}
