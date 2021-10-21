package filesPackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedReadExam {
//it makes the performance fast and it is used to read the data line by line.
	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr=new FileReader("C:\\Users\\D1\\Desktop\\A.txt");
		BufferedReader br=new BufferedReader(fr);
		try {
		int i;
		while((i=br.read())!=-1)
		{
			System.out.print((char)i);
		}
		}
		catch (Exception e) {
			System.out.println();
		}
	}
}
