package com.bikesowroom;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FeedBack {
	public static void customerFeedBack() throws IOException{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Feed Back :");
		String  feedBack= scanner.nextLine();
		System.out.println("Thang For You FeedBack");
		FileWriter fileWriter = new FileWriter("D:\\ShowRoom\\FeedBack.txt",true);
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		PrintWriter printWriter= new PrintWriter(bufferedWriter);
		printWriter.println(feedBack);
		printWriter.close();
	
	}
}
