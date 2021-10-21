package filePackage;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;




//comma separated value is used to store tabular data in simple text form 
public class ReadCsvFiles {
public static void main(String[] args) throws Exception {
	
	  Scanner sc=new Scanner(new File("C:\\Users\\D1\\Desktop\\CSVDemo.csv"));
	 sc.useDelimiter(","); while(sc.hasNext()); { System.out.println(sc.next());
	  }
	 
	System.out.println("951914");
    sc.close();
	
}
}
