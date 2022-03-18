package com.bikesowroom;
import java.io.*;
import java.util.*;

public class MainClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner  scanner= new Scanner(System.in);
		String intro="\bWeLCoME To YAMAHA ShOwRoOm OnLiNe\n";
		BikeModelAndMyProduct myProduct= new BikeModelAndMyProduct();
		for (int i = 0; i < intro.length(); i++) {
			System.out.print(intro.charAt(i));
			Thread.sleep(100);
		}
		while (true) { 		
			System.out.println("                 **********HOME PAGE**********");
			System.out.println("BOOK NOW '1' :");
			System.out.println("ALL CUSTOMER DETAILS '2':");
			System.out.println("SEARCH DETAILS BY CUSTOMER MOBILE NUMBER '3' :");
			System.out.println("MY PRODUCTS ENTER '4'");
			System.out.println("Exit ENTER '0'");

			String stringValue = scanner.nextLine();

			switch (stringValue) {
			case "1":
				Registration registration= new Registration();
				FileWriter fileWriter = new FileWriter(FileLocation.location(),true);
				BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
				PrintWriter printWriter= new PrintWriter(bufferedWriter);
				printWriter.println(registration.toString());
				printWriter.close();
				break;	

			case "2":
				AllCoustomerDetails.allCustomerDetails();
				break;

			case "3":
				SearchDetailsByMobileNumber.searchByMobileNumber();		
				break;
				
			case "4":
				myProduct.bikeModel();
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