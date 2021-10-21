package filesPackage;

import java.io.FileWriter;

public class FileWriterExam {
//it is used to write character-oriented data.
	public static void main(String[] args) throws Exception{
		FileWriter fw=new FileWriter("C:\\Users\\D1\\Desktop\\A.txt");
		//in file output stream, we convert the byte into string, but here it can converts directly.
		fw.write("hello-teja");
		fw.close();
		System.out.println("success");
	}
}
