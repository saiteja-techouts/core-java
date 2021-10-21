package filePackage;

import java.io.File;

public class DeletingFile {
public static void main(String[] args) {
	//we can delete the file in two ways, 1. File.delete() and 2.File.deleteOnExit()
	File f1=new File("teja.txt","xyz.txt");
	if(f1.delete())
	{
		System.out.println("file deleted"+f1.getName());
	}
	else
	{
		System.out.println("failed to delete");
	}
}
}
