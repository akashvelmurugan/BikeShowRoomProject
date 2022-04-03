package com.bikesowroom;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Registration {
	String customerName;
	String mobile;
	String customerAge;
	String bikeModel;
	String bikeNumber;

	public void registor() throws InterruptedException, IOException {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Customer Name :");
		this.customerName = scanner.nextLine();
		System.out.println(customerName);

		while(true) {
			System.out.println("Enter Customer Mobile Number :");
			String mobile = scanner.nextLine();
			if(mobile.length()==10) {
				this.mobile=mobile;
				System.out.println(mobile);
				break;			
			}else {
				System.out.println("YOU ENTERD INVALID NUMBER PLEASE REENTER VALID NUMBER");
			}
		}
		System.out.println("Enter The Coustomer Age");
		this.customerAge = scanner.nextLine();
		System.out.println(customerAge);


		outer: while(true) {
			System.out.println("Enter Your Option\n-> 1 R15M(B)\n-> 2 R15 V4\n-> 3 MotoGB Edition\n-> 4 R15S\n-> 5 R15\n-> 6 MT-15\n-> 7 FZS 25\n-> 8 FZ 25\n-> 9 FZ-X\n-> 10 FZ-S F1\n-> 11 FZ-F1");	
			String productModel = scanner.next();
			switch (productModel) {
			case "1":
				bikeModel="R15M(B)";
				System.out.println("R15M(B)");
				break outer;
			case "2":
				this.bikeModel="R15 V4";	
				System.out.println("R15 V4");
				break outer;
			case "3":
				this.bikeModel="MotoGB Edition";	
				System.out.println("MotoGB Edition");
				break outer;
			case "4":
				this.bikeModel="R15S";
				System.out.println("R15S");
				break outer;
			case "5":
				this.bikeModel="R15";
				System.out.println("R15");
				break outer;
			case "6":
				this.bikeModel="MT-15";
				System.out.println("MT-15");
				break outer;
			case "7":
				this.bikeModel="FZS 25";
				System.out.println("FZS 25");
				break outer;
			case "8":
				this.bikeModel="FZ 25";
				System.out.println("FZ 25");
				break outer;
			case "9":
				this.bikeModel="FZ-X";
				System.out.println("FZ-X");
				break outer;
			case "10":
				this.bikeModel="FZ-S F1";
				System.out.println("FZ-S F1");
				break outer;
			case "11":
				this.bikeModel="FZ-F1";
				System.out.println("FZ-F1");
				break outer;
			default:
				System.out.println("Invalid Selection \nPlease Enter Correct Option");
				break;
			}
		}

		System.out.println("Enter Bike Number (ALL CAPS):");
		String number= scanner.next();
		String upperCase = number.toUpperCase();
		this.bikeNumber=upperCase; 
		System.out.println(bikeNumber);
		System.out.println("****REGISTRATION SUCCESSFULLY****");
	}

	public String toString() {
		return customerName+","+mobile +","+customerAge+","+bikeModel+","+bikeNumber;
	}

}