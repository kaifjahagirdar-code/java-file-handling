package com.cc.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      BufferedReader bw= new BufferedReader(new FileReader("myFileReader.txt"));
      char[] crr= new char[100];
      bw.read(crr);
      for(char c:crr) {
    	  System.out.print(c);
      }
     
      }

}
