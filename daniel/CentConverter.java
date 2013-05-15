package week2;

import java.util.Scanner;

public class CentConverter {
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter cents: ");
		int cents = sc.nextInt();
		converter(cents);
	}
	
	public static void converter(int cents){
		System.out.println(cents/100+" euro "+cents%100+" cents.");
	}

}
