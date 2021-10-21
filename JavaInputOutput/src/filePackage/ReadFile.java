package filePackage;

import java.io.FileReader;

import java.io.FileReader;

public class ReadFile {
public static void main(String[] args) throws Exception {
	/*
	 * FileReader fr=new FileReader("teja.txt"); int i=fr.read();
	 * System.out.println((char)i); fr.close();
	 */
	
	// to read all the characters 
	FileReader fr1=new FileReader("teja.txt");
	int i;
	while((i=fr1.read())!=-1)
	{
		System.out.println((char)i);
	}
	fr1.close();
	
}
}
