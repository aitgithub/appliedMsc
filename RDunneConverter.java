import java.util.Scanner;


public class Converter {
	
	public static void main(String[] args) {
	System.out.println("please enter cent amount");	
	Scanner sc =new Scanner(System.in);
	int i=sc.nextInt();
	
	if (i>=0){
		
		int x=(i/100);
		
		int y=(i%100);
		
		System.out.println(x+" Euro and "+y+" cents");
	}

	}
}
