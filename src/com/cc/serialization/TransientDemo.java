package com.cc.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		User user1 =new User(4028, "mdkaifaj402@gmail.com", "HHGF123dd");
		System.out.println(user1);
		System.out.println("======Before Serialization=======");
		
		FileOutputStream fos= new FileOutputStream("credentials.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(user1);
		
		System.out.println("=====Serialization Completed Successfully=====");
		
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream("credentials.ser"));
		User user2 =  (User) ois.readObject();
		System.out.println("====After Serialization====");
		System.out.println(user2);
        oos.close();
        ois.close();
		
	}

}
