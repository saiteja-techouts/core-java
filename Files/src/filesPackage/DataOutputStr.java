package filesPackage;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStr {
//gen javaApplications used DataOutputStream to write the data later that can be read by DataInputStream.
	public static void main(String[] args) throws Exception{
		FileOutputStream fos=new FileOutputStream("C:\\Users\\D1\\Desktop\\A.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		dos.write(80);
		dos.flush();
		dos.close();
		fos.close();
		System.out.println("done");
	}
}
