package filesPackage;

import java.io.FileReader;

public class FileReaderExam {
//it is used to read the data from the file and it returns the data in the form of byte format expression
	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("C:\\Users\\D1\\Desktop\\A.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}
}
