public class currencyConverter {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter an amount in cents:");
		int amount = in.nextInt();
		int euro = amount / 100;
		int cents = amount % 100;
		System.out.println(amount+" cents is equal to "+euro+" euro and "+cents+" cents");
	}
}