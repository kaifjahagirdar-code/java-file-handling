package com.cc.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         BufferedWriter bw= new BufferedWriter(new FileWriter("abc.txt",true));
         
         bw.write("line 1");
         bw.newLine();
         bw.write("line 2");
         bw.newLine();
         bw.write("line 3");
         System.out.println("k");
         bw.close();
         
	}

}
