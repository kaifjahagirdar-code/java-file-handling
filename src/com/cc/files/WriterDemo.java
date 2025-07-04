package com.cc.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file1= new File("autobiography.txt");
		file1.createNewFile();
		
		FileWriter writer1= new FileWriter(file1);
		
		writer1.write("B");
		
		writer1.close();
		System.out.println("Writting Completed");

	}

}
 