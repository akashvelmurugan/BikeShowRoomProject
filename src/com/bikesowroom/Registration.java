package com.bikesowroom;

import java.util.Scanner;

public class Registration {
	String coutomerName;
	String mobile;
	String coutomerAge;
	String bikeModel;
	String bikeNumber;

	public Registration() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Coustomer Name :");
		this.coutomerName = scanner.nextLine();
		System.out.println(coutomerName);

		System.out.println("Enter Coustomer Mobile Number :");
		this.mobile = scanner.nextLine();
		System.out.println(mobile);

		System.out.println("Enter The Coustomer Age");
		this.coutomerAge = scanner.nextLine();
		System.out.println(coutomerAge);

		System.out.println("Enter Bike Model");
		this.bikeModel = scanner.nextLine();
		System.out.println(bikeModel);

		System.out.println("Enter Bike Number (ALL CAPS):");
		this.bikeNumber = scanner.nextLine();
		System.out.println(bikeNumber);
		scanner.close();
	}
	public String toString() {
		return coutomerName+" "+mobile +" "+coutomerAge+" "+bikeModel+" "+bikeNumber;
	}
}
