package com.distributed.currency;


import java.util.Scanner;

public class CurrencyConverter {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Welcome To Dereks Money Converter");
		System.out.println();
		System.out.println("Please Enter The Amount You Wish To Convert\t");
		
		int cents = sc.nextInt();
		
		converter(cents);
		
		
		
	
		
		

	}
	
	public static void converter(int cents){
		System.out.println(cents/100+" euro "+cents%100+" cents.");
	}

	

}
