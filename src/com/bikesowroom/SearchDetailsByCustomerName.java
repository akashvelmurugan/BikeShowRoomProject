package com.bikesowroom;

import java.io.*;
public class SearchDetailsByCustomerName {
	public static void allCustomerDetails() throws IOException { 
		File file= new File("D:\\ShowRoom\\ShowRoom.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader= new BufferedReader(fileReader);
		StringBuffer buffer=new StringBuffer();
		String line;
		while ((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
			buffer.append("\n");
		}
		fileReader.close();
		System.out.println(buffer.toString());
	}
}