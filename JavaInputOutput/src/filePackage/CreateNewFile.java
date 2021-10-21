package filePackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateNewFile {
//we can create a new file in three ways. 1.using file.createNewfile() method, 2.file.createFile() method,3.file OutputStream class
	public static void main(String[] args) throws Exception {

		File f = new File("xyz1");
		boolean result;

		result = f.createNewFile();
//createNewfile() method is used to create a new and empty file
		if (result) {
			System.out.println("file created");
		} else {
			System.out.println("file already created");
		}
		
//creating the file by using the output stream class.
//Output stream is used to write the data into the file.
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file name");
		String str=sc.next();
		//the fileoutputstream class provides a  constructor to create a file
		FileOutputStream fos=new FileOutputStream(str,true);
		System.out.println("enter the text");
		String str1=sc.next();
		byte[] b=str1.getBytes();
		fos.write(b);
		fos.close();
		
//we can also create a new and empty file using createFile() method, it has an advantage that no need to close the file.

		/*
		 * //first we have to create a path instance.. Path p
		 * =Paths.get("C:\\Users\\D1\\Desktop\\B.txt"); Path p1=Files.createFile(p);
		 * FileOutputStream fi=new FileOutputStream("B.txt"); String
		 * s="welcome to file creation"; byte[] b1=s.getBytes(); fi.write(b1);
		 * fi.close(); System.out.println("file create at path"+p1);
		 */
	}

}
