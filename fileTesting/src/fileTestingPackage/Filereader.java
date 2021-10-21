package fileTestingPackage;

import java.io.FileReader;

public class Filereader {
public static void main(String[] args) throws Exception{
	FileReader fr=new FileReader("C:\\Users\\D1\\Desktop\\A.txt");
	int i=0;
	while((i=fr.read())!=-1)
	{
		System.out.print((char)i);
	}
	System.out.println("success");
}
}
