package com.bikesowroom;
import java.io.*;
import java.util.*;

public class MainClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner  scanner= new Scanner(System.in);
		String intro="Welcome to Tamilnadu Yamaha Bike ShowRoom Online\n";
		BikeModelAndMyProduct myProduct= new BikeModelAndMyProduct();
		for (int i = 0; i < intro.length(); i++) {
			System.err.print(intro.charAt(i));
			Thread.sleep(80);
		}

		while (true) { 		
			System.out.println("             **********HOME PAGE**********");
			System.out.println("BOOK NOW '1' :");
			System.out.println("ALL CUSTOMER DETAILS '2':");
			System.out.println("SEARCH DETAILS BY CUSTOMER MOBILE NUMBER '3' :");
			System.out.println("MY PRODUCTS ENTER '4'");
			System.out.println("SERVICE INFORMATION '5' :");
			System.out.println("EXIT ENTER '0'");


			String customerOption = scanner.next();


			switch (customerOption) {

			case "1":

				Registration registration= new Registration();
				registration.registor();

				FileWriter fileWriter = new FileWriter(FileLocation.location(),true);
				BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
				PrintWriter printWriter= new PrintWriter(bufferedWriter);
				printWriter.println(registration.toString());
				printWriter.close();
				break;	

			case "2":
				while(true) {
					System.out.println("Enter Your Password :");
					String password=scanner.next();
					if(password.equals("password")) {
						AllCoustomerDetails.allCustomerDetails();
						break;
					}else {
						System.out.println("You Entered Wrong Password !!!!!!!");
					}
				}
				break;

			case "3":
				SearchDetailsByMobileNumber.searchByMobileNumber();		

				break;
			case "4":
				myProduct.bikeModel();
				break;
			case "5":
				ServiceAndInfo.customerFeedBack();	
				break;	

			case "0":
				scanner.close();
				Exit.exit();
				System.exit(0);
				break;

			default:
				System.out.println("!!!!!!!! You Entered Wrong Option!!!!!!!!");
				System.out.println(" => Please Enter Correct Option");
				break;
			}
		}
	}
}