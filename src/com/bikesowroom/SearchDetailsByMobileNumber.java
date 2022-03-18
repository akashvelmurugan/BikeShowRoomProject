package com.bikesowroom;
import java.io.*;
import java.util.Scanner;;

public class SearchDetailsByMobileNumber {
	static Scanner scanner= new java.util.Scanner(System.in);
	public static void searchByMobileNumber() throws IOException{
		System.out.println("Enter Your Mobile Number : ");
		String mobileNumber=scanner.nextLine();

		FileReader file = new FileReader(FileLocation.location());
		BufferedReader bf= new BufferedReader(file);

		System.out.println(mobileNumber +" Your Details");
		String line;
		boolean flag=false;
		int lines=countingLines();
		for(int i=0;i<lines;i++){
			line = bf.readLine();
			String[] array=line.split(" ");
			if(array[1].equalsIgnoreCase(mobileNumber))
			{
				flag=true;
				displayDetails(array);
			}
		}
		if(!flag){
			System.out.println("No Data");
		}
		file.close();
		bf.close();
	}
	public static void displayDetails(String[] array) {
		System.out.println("Your name is           : "+array[0]);
		System.out.println("Your Mobile Number     : "+array[1]);
		System.out.println("Your Customer Age      : "+array[2]);
		System.out.println("Your Bike Model        : "+array[3]);
		System.out.println("Your Bike Number       : "+array[4]);

	}
	public static int countingLines() throws IOException {
		int count=0;
		FileReader read = new FileReader(FileLocation.location());
		BufferedReader reader = new BufferedReader(read);
		while((reader.readLine())!=null){
			count++;
		}
		read.close();
		reader.close();
		return count;
	}
}

