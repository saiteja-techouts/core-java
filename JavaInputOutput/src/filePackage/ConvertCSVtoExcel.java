package filePackage;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ConvertCSVtoExcel {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws IOException {
	ArrayList<ArrayList<String>> arr=new ArrayList<ArrayList<String>>();
	ArrayList<String> al=null;
	DataInputStream dis=new DataInputStream(new FileInputStream("C:\\Users\\D1\\Desktop\\CSVDemo.csv"));
	
	String str;
	while ((str = dis.readLine()) != null) {
		al=new ArrayList<String>();
		String str1[]=str.split(",");
		for (String cell : str1) {
			System.out.print(cell);
		}
		System.out.println();
	}
}
}
