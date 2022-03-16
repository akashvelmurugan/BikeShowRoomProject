package com.bikesowroom;

import java.io.*;
import java.util.*;

public class MainClass {
	public static void main(String[] args) throws IOException {
		Scanner  scanner= new Scanner(System.in);
		ArrayList<Registration> regester=new ArrayList<>();
	
		Registration registration;
			
		while (true) { 		
			System.out.println("                     **********HOME PAGE**********");
			System.out.println("Enter 'Registration' 'allCustomerDetails' 'SearchDetailsByBikeNumber' 'exit'");
			String string = scanner.nextLine();
			String upperCase = string.toUpperCase();
			
			switch (upperCase) {
			case "REGISTRATION":
				registration= new Registration();
				regester.add(registration);
				FileWriter fileWriter = new FileWriter("D:\\ShowRoom\\ShowRoom.txt",true);
				BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
				PrintWriter printWriter= new PrintWriter(bufferedWriter);
				printWriter.println(regester.toString());
				printWriter.close();
				//System.out.println(regester);
				break;	
				
			case "ALLCUSTOMERDETAILS":
			SearchDetailsByCustomerName.allCustomerDetails();
				break;

			case "SEARCHDETAILSBYMOBILENUMBER":
				SearchByBikeNumber.searchByBikeNumber();
				break;

			case "EXIT":
				scanner.close();
				Exit.exit();
				//printWriter.close();
				System.exit(0);
				break;
				
			default:
				System.out.println("Enter Correct Option");
				break;
			}
		}
	}
}