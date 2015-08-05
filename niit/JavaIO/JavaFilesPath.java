package com.niit.JavaIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class JavaFilesPath {

	public static void main(String[] args) {
		Path myPath = Paths.get("demofile");
		
		try {
			Path myPath1=Files.createFile(myPath);
			File file = new File(myPath1.toString());
			
			FileWriter fileRriter = new FileWriter(file);  
			fileRriter.write("Details in the file");
			fileRriter.flush();
			fileRriter.close();			
			File Copiedfile = new File("CopiedFile");
			Path copyPath1   = Paths.get(Copiedfile.getPath());
			Files.copy(myPath, copyPath1 ,StandardCopyOption.REPLACE_EXISTING);	
			System.out.println("Done");	
			
			  File f = new File("sasi.txt");
              
			  if(f.exists()){
				  System.out.println("File existed");
			  }else{
				  System.out.println("File not found! Creating it");
				  f.createNewFile();
			  }
		}
		catch (FileAlreadyExistsException e)
		{
			try {
				Files.delete(myPath);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("File already exists .Now Deleted. Run again.");
			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
