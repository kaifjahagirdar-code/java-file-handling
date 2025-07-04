package com.cc.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Task1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter writer= new PrintWriter(new File("file2.txt"));
		writer.println("AAA");
		writer.println("BBB");
		writer.println("CCC");
        writer.flush();
        writer.close();
        
        writer= new PrintWriter(new File("file3.txt"));
		writer.println("111");
		writer.println("222");
		writer.println("333");
        writer.flush();
        writer.close();
        
        writer = new PrintWriter(new FileWriter("target.txt"));
            
        BufferedReader reader= new BufferedReader(new FileReader("file2.txt"));
        String line= reader.readLine();
        while(line != null)
        {
        	writer.println(line);
        	line= reader.readLine();
        	
        }
        reader.close();
        reader= new BufferedReader(new FileReader("file3.txt"));
        String line2= reader.readLine();
        while(line2 != null)
        {
        	writer.println(line2);
        	line2= reader.readLine();
        	
        }
        reader.close();
        writer.close();
        System.out.println("Hii");
        
                
       
	}

}
