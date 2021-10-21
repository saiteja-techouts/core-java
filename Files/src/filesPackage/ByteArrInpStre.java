package filesPackage;

import java.io.ByteArrayInputStream;

public class ByteArrInpStre {
/*bytearrayInputStream is composed of two words byteArray and InputStream, 
 it can be used to read the byte array as inputStream*/
	public static void main(String[] args) {
		byte[] arr= {35,36,36};
		ByteArrayInputStream bis=new ByteArrayInputStream(arr);
		
		int i=0;
		while((i=bis.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
}
