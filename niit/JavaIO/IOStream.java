package com.niit.JavaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = new byte[100];
		char cbuf[] = new char[100];

		try(FileInputStream Fin = new FileInputStream("C://Users//megha_000/Documents/Roshan/java/Spring/JavaInheritance/src/Roshan.txt");
				FileReader FReaderIN =  new FileReader("C://Users//megha_000/Documents/Roshan/java/Spring/JavaInheritance/src/Roshan.txt");				
				FileWriter outputStream = new FileWriter("roshanout.txt");
				FileOutputStream fileOut = new FileOutputStream("student.ser");
				)
		{
			ObjectOutputStream  objOut = new ObjectOutputStream (fileOut);
			System.out.println(Fin.available());			
			Fin.read(b);
			for(byte c:b)
			System.out.print((char)c);
			System.out.println();
			System.out.println(FReaderIN.read(cbuf));			
			for(char c:cbuf)
				System.out.print(c);
			
			String message = "Hi I am writing to a file from here";
			outputStream.write(message);	
			
			Student myStudent = new Student("Roshan",24,86.7);
			objOut.writeObject(myStudent);
			
			
		} catch (IOException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
