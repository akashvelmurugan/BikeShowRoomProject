package com.bikesowroom;

import java.util.Scanner;

public class Registration {
	String coutomerName;
	String mobile;
	String coutomerAge;
	String bikeModel="";
	String bikeNumber;
	public Registration() throws InterruptedException {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Coustomer Name :");
		this.coutomerName = scanner.nextLine();
		System.out.println(coutomerName);
		boolean b=true;
		while(b) {
			System.out.println("Enter Customer Mobile Number :");
			String mobile = scanner.nextLine();
			if(mobile.length()==10) {
				this.mobile=mobile;
				System.out.println(mobile);
				b=false;			
			}else {
				b=true;
				System.out.println("YOU ENTERD INVALID NUMBER PLEASE REENTER VALID NUMBER");
			}
		}
		System.out.println("Enter The Coustomer Age");
		this.coutomerAge = scanner.nextLine();
		System.out.println(coutomerAge);

		boolean condition=true;
		while(condition) {
			System.out.println("Enter Your Option\n-> 1 R15M(B)\n-> 2 R15 V4\n-> 3 MotoGB Edition\n-> 4 R15S\n-> 5 R15\n-> 6 MT-15\n-> 7 FZS 25\n-> 8 FZ 25\n-> 9 FZ-X\n-> 10 FZ-S F1\n-> 11 FZ-F1");	
			String productModel = scanner.next();
			switch (productModel) {
			case "1":
				bikeModel="R15M(B)";
				System.out.println("R15M(B)");
				condition=false;
				break;
			case "2":
				this.bikeModel="R15 V4";	
				System.out.println("R15 V4");
				condition=false;
				break;
			case "3":
				this.bikeModel="MotoGB Edition";	
				System.out.println("MotoGB Edition");
				condition=false;
				break;
			case "4":
				this.bikeModel="R15S";
				System.out.println("R15S");
				condition=false;
				break;
			case "5":
				this.bikeModel="R15";
				System.out.println("R15");
				condition=false;
				break;
			case "6":
				this.bikeModel="MT-15";
				System.out.println("MT-15");
				condition=false;
				break;
			case "7":
				this.bikeModel="FZS 25";
				System.out.println("FZS 25");
				condition=false;
				break;
			case "8":
				this.bikeModel="FZ 25";
				System.out.println("FZ 25");
				condition=false;
				break;
			case "9":
				this.bikeModel="FZ-X";
				System.out.println("FZ-X");
				condition=false;
				break;
			case "10":
				this.bikeModel="FZ-S F1";
				System.out.println("FZ-S F1");
				condition=false;
				break;
			case "11":
				this.bikeModel="FZ-F1";
				System.out.println("FZ-F1");
				condition=false;
				break;
			default:
				System.out.println("Invalid Selection \nPlease Enter Correct Option");
				break;
			}
		}
		
		System.out.println("Enter Bike Number (ALL CAPS):");
		this.bikeNumber = scanner.next();
		System.out.println(bikeNumber);
		System.out.println("****REGISTRATION SUCCESSFULLY****");
	}
	public String toString() {
		return coutomerName+" "+mobile +" "+coutomerAge+" "+bikeModel+" "+bikeNumber;
	}
}