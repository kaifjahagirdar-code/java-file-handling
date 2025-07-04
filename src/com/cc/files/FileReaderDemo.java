package com.cc.files;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new java.io.FileReader("cde.txt"));
		String line = reader.readLine();
		while (line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		reader.close();
	
	}

}
