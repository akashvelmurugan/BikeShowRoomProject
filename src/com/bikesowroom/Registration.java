package com.bikesowroom;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {
	Scanner scanner = new Scanner (System.in);
	String bikeModel;
	CustomerDatails customerDatails = new CustomerDatails();
	public void registration() throws IOException {

		//		CustomerDatails customerDatails = new CustomerDatails();
		getCustomerName();

		System.out.println("Your Name Is:"+customerDatails.getCustomerName()+"\n");

		System.out.println("Enter Customer Mobile Number : ");
		customerDatails.setMobile(scanner.next());
		System.out.println("Your Mobile Number Is :"+customerDatails.getMobile()+"\n");

		System.out.println("Enter Customer Age : ");
		customerDatails.setCustomerAge(scanner.next());
		System.out.println("Your Age Is :"+customerDatails.getCustomerAge()+"\n");

		outer: while(true) {
			System.out.println("Enter Your Option\n-> 1 R15M(B)\n-> 2 R15 V4\n-> 3 MotoGB Edition\n-> 4 R15S\n-> 5 R15\n-> 6 MT-15\n-> 7 FZS 25\n-> 8 FZ 25\n-> 9 FZ-X\n-> 10 FZ-S F1\n-> 11 FZ-F1");	
			String productModel = scanner.next();

			switch (productModel) {
			case "1":
				bikeModel="R15M(B)";
				break outer;
			case "2":
				this.bikeModel="R15 V4";	
				break outer;
			case "3":
				this.bikeModel="MotoGB Edition";	
				break outer;
			case "4":
				this.bikeModel="R15S";
				break outer;
			case "5":
				this.bikeModel="R15";
				break outer;
			case "6":
				this.bikeModel="MT-15";
				break outer;
			case "7":
				this.bikeModel="FZS 25";
				break outer;
			case "8":
				this.bikeModel="FZ 25";
				break outer;
			case "9":
				this.bikeModel="FZ-X";
				break outer;
			case "10":
				this.bikeModel="FZ-S F1";
				break outer;
			case "11":
				this.bikeModel="FZ-F1";
				break outer;
			default:
				System.out.println("Invalid Selection \nPlease Enter Correct Option");
				break;
			}
		}
		customerDatails.setBikeModel(bikeModel);
		System.out.println("Your Bike Option IS :"+customerDatails.getBikeModel()+"\n");

		System.out.println("Enter Your Bike Number : ");
		customerDatails.setBikeNumber(scanner.next());
		System.out.println("Your Bike Number Is : "+customerDatails.getBikeNumber()+"\n");

		ArrayList<CustomerDatails> arrayList = new ArrayList<>();
		arrayList.add(customerDatails);

		FileOutputStream fileOutputStream = new FileOutputStream(FileLocation.location());
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(arrayList);
		System.out.println("Registration Successfully\n~ Thanks For Your Registration ~");
		objectOutputStream.flush();
		fileOutputStream.close();
		objectOutputStream.close();
	}

	public void getCustomerName() {
		//	customerDatails.setCustomerName(scanner.next());
		boolean b=true;
		while (b) {
			System.out.println("Enter Your Name ( -> in ' Aadhar ')");
			String customerName = scanner.next();	
			int counter=0;
			for (int i = 0; i < customerName.length(); i++) {
				if(customerName.charAt(i)>='a'||customerName.charAt(i)<='z'||customerName.charAt(i)>='A'||customerName.charAt(i)>='Z') {
					counter++;
				}
			}
			if (customerName.length()==counter) {
				customerDatails.setCustomerName(customerName);
				b=false;
			}

		}

	}	
}













