package filesPackage;

import java.io.FileOutputStream;
import java.util.Scanner;

public class CreatingFileOutStream {
//it is used to enter the data for newly created file.
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name");
		String str=sc.nextLine();
		FileOutputStream fos=new FileOutputStream(str,true);
		System.out.println("Enter file content");
		String st1=sc.nextLine();
		byte[] b1=st1.getBytes();
		fos.write(b1);
		fos.close();
		System.out.println("file saved");
	}
}
