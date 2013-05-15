import java.util.Scanner;


public class AndrusConvertor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Please enter a number of cents");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println("The euro equilivant is:"+(double)input/100 +" Euros");
	}

}
