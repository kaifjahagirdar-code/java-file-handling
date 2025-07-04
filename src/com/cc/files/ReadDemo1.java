package com.cc.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file1= new File("myFileReader.txt");
		file1.createNewFile();
		
		FileReader reader1= new FileReader(file1);
		
		char[] crr= new char[1000];
		
		reader1.read(crr);
		
		for(char c: crr) {
		System.out.print(c);

	}	
	System.out.println("The End");
}
}

