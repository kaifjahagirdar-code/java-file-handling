package com.cc.files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class PrintWriterDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		PrintWriter writer= new PrintWriter(new FileWriter("file1.txt"));
		writer.println("ABCD");
		writer.println(1234);
		writer.println(12.34);
		writer.println(true);
		writer.close();
		System.out.println("Hiii");
		
		}

}
