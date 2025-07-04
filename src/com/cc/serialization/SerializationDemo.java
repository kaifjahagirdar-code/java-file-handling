package com.cc.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Employe e1 =new Employe(101, "Steve", 2500.25);
		System.out.println(e1);
		
		FileOutputStream fos= new FileOutputStream("emp1.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(e1);
		
		System.out.println("=====Serialization Completed Successfully=====");
		
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("emp1.ser"));
		Employe e2 = (Employe) ois.readObject();
		System.out.println("====After Serialization====");
		System.out.println(e2);
        oos.close();
        ois.close();
	}

}
