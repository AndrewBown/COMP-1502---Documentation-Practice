package mru.practice.application;

import java.util.Scanner;

public class AppDriver {

	public static void main(String[] args) {

		String name;
		double hourlyPay, payment;
		float hours;
		
		
		Scanner input= new Scanner (System.in);
		
		System.out.print("What is your name:");
		name = input.nextLine();
		
		System.out.print("How much is your pay rate:");
		hourlyPay = input.nextDouble();
		
		System.out.print("How many hours have you worked:");
		hours = input.nextFloat();
		
		payment = hours*hourlyPay;
		System.out.printf("%s next payment amount is: %.2f",name, payment);
		
		
	}

}
