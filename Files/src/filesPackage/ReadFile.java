package filesPackage;

import java.io.FileInputStream;

public class ReadFile {
	public static void main(String args[]){    
        try{    
          FileInputStream fin=new FileInputStream("C:\\Users\\D1\\Desktop\\A.txt");    
          int i=fin.read();  
          System.out.print((char)i);    

          fin.close();    
        }catch(Exception e){System.out.println(e);}    
       }    
}
