package filesPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadAllCharacters {
public static void main(String[] args) throws IOException {
	try {
		FileInputStream fi=new FileInputStream("C:\\Users\\D1\\Desktop\\A.txt");
		int i=0;
		 while((i=fi.read())!=-1){    
             System.out.print((char)i);    
            }    
            fi.close();
            
	} 
	catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	
}
}
