package com.niit.JavaIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fileIN = new FileInputStream("student.ser");
		ObjectInputStream ObjIN= new ObjectInputStream(fileIN);)
		{
			Student mystudent = (Student) ObjIN.readObject();
			System.out.println(mystudent);
		} catch (IOException | ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
