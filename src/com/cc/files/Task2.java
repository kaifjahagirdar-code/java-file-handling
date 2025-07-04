package com.cc.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Task2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				PrintWriter writer= new PrintWriter(new File("file4.txt"));
				writer.println("AAA");
				writer.println("BBB");
				writer.println("CCC");
		        writer.flush();
		        writer.close();
		        
		        writer= new PrintWriter(new File("file5.txt"));
				writer.println("111");
				writer.println("222");
				writer.println("333");
		        writer.flush();
		        writer.close();
		        
		        writer = new PrintWriter(new FileWriter("target2.txt"));
		            
		        BufferedReader reader= new BufferedReader(new FileReader("file4.txt"));
		        BufferedReader reader1= new BufferedReader(new FileReader("file5.txt"));
		        
		        String line1= reader.readLine();
		        String line2= reader1.readLine();
		        while(line1 != null || line2 != null)
		        {
		        	if(line1 != null)
		        	{
		        	writer.println(line1);
		        	line1= reader.readLine();
                     }
		        
		        	if(line2 != null)
		        	{
		        	writer.println(line2);
		        	line2= reader1.readLine();
                     }	        	
	        }
		        
		        reader.close();
		        reader1.close();
		        writer.close();
		        System.out.println("Hii");
		        
		               
	}

}
