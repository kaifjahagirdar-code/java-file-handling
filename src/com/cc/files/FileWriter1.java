package com.cc.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("hi");
		File f1= new File("Writer.txt");
		System.out.println("Hello");
		f1.createNewFile();
		f1.exists();
		
		FileWriter writer1= new FileWriter(f1);
		writer1.write("Today is Interview");
		writer1.write("/n Interview is scheduled at 3pm");
		writer1.write("This opportunity is from clubcoder");
		writer1.close();
		
		FileReader reader1= new FileReader("nsdjhfcu");
		char[] crr= new char[100];
		reader1.read(crr);

	}

}
