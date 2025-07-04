package com.cc.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
           BufferedWriter writer= new BufferedWriter(new FileWriter("cde.txt"));
           writer.write(100);
          // writer.write(true);
          // writer.write(12.5);
           
          
           System.out.println("Hi");
           writer.close();
	}

}

