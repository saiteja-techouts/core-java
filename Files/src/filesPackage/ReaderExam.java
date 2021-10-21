package filesPackage;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExam {
//it is used to read the  character streams
	public static void main(String[] args) throws Exception {
		Reader r1=new FileReader("C:\\Users\\D1\\Desktop\\A.txt");
		int i;
		while((i=r1.read())!=-1)
		{
			System.out.print((char)i);
		}	
		r1.close();
	}
}
