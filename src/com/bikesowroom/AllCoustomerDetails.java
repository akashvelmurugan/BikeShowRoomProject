package com.bikesowroom;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class AllCoustomerDetails {
	Scanner scanner = new Scanner(System.in);
	public void passWordVerfication() throws ClassNotFoundException, IOException{
		while(true) {
			System.out.println("Enter Your Password :");
			String password=scanner.next();
			if(password.equals("password")) {
				allCustomerDetails();
				break;
			}else {
				System.out.println("You Entered Wrong Password !!!!!!!");
			}
		}
	}
	public static void allCustomerDetails() throws IOException, ClassNotFoundException { 
		
		FileInputStream fileInputStream = new FileInputStream(FileLocation.location());
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		ArrayList<Registration> arrayList = (ArrayList<Registration>) inputStream.readObject();
		System.out.println(arrayList.toString());	

	}
}