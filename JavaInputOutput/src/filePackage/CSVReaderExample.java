package filePackage;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVReader;

public class CSVReaderExample {
	static List<String> li = new ArrayList<String>();

	public static void main(String[] args) throws Exception {

		CSVReader re = new CSVReader(new FileReader("C:\\Users\\D1\\Desktop\\CSVDemo.csv"));
		String[] str;
		//ArrayList<String> al=null;
		// we are going to read data line by line
		while ((str = re.readNext()) != null) {
			for (String cell : str) {
				li.add(cell);
			}System.out.println(li);
			
			
			/*
			 * String thisLine; DataInputStream myInput = new DataInputStream(new
			 * FileInputStream("C:\\Users\\D1\\Desktop\\CSVDemo.csv")); while ((thisLine =
			 * myInput.readLine()) != null) { li = new ArrayList<String>(); String strar[] =
			 * thisLine.split(","); for (int j = 0; j < strar.length; j++) { String edit =
			 * strar[j].replace('\n', ' '); al.add(edit); } li.addAll(al);
			 * System.out.println(); }
			 */
	//	System.out.println(li);
		 
         try {
             HSSFWorkbook hwb = new HSSFWorkbook();
             HSSFSheet sheet = hwb.createSheet("new sheet");

             for (int k = 0; k < li.size(); k++) {
                 ArrayList<String> ardata =new ArrayList<> (Arrays.asList(li.get(k)));
                 HSSFRow row = sheet.createRow((short) 0 + k);

                 for (int p = 0; p < ardata.size(); p++) {
                     System.out.print(ardata.get(p));
                     HSSFCell cell = row.createCell((short) p);
                     cell.setCellValue(ardata.get(p).toString());
                 }
             }

             FileOutputStream fileOut = new FileOutputStream("C:\\Users\\D1\\Desktop\\JavaBooks.xls");
             hwb.write(fileOut);
             fileOut.close();

            // System.out.println(name + ".xls has been generated");
         } catch (Exception ex) {
         }

			/*
			 * //FileOutputStream os=new FileOutputStream("sai.xlsx"); int rowCount = 0;
			 * 
			 * for (String aBook : li) { for(String[] a : aBook) {
			 * 
			 * } Row row = sheet.createRow(++rowCount);
			 * 
			 * int columnCount = 0;
			 * 
			 * for (String field : aBook) { Cell cell = row.createCell(++columnCount); if
			 * (field instanceof String) { cell.setCellValue((String) field); } else if
			 * (field instanceof Integer) { cell.setCellValue((Integer) field); } }
			 * 
			 * }
			 * 
			 * 
			 * try (FileOutputStream outputStream = new FileOutputStream("JavaBooks.xlsx"))
			 * { workbook.write(outputStream); } }
			 */
		
	}
}
}
