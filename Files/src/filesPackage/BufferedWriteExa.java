package filesPackage;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriteExa {
//it performs very fast to write the data to destination.
	public static void main(String[] args) throws Exception{
		FileWriter fw=new FileWriter("C:\\Users\\D1\\Desktop\\A.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("this is buffered writer");
		bw.close();
		System.out.print("BW done");
	}
}
