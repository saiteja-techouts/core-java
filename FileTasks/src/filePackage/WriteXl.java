package filePackage;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

public class WriteXl {
	 public static void main(String[] args) throws Exception
	    {
	        // workbook object
	        HSSFWorkbook workbook = new HSSFWorkbook();
	  
	        // spreadsheet object
	        HSSFSheet spreadsheet
	            = workbook.createSheet(" Student Data ");
	  
	        // creating a row object
	        HSSFRow row;
	  
	        // This data needs to be written (Object[])
	        Map<String, Object[]> studentData
	            = new TreeMap<String, Object[]>();
	  
	        studentData.put("1", new Object[] { "Roll No", "NAME", "Year" });
	  
	        studentData.put("2", new Object[] { "128", "Sai","2nd year" });
	  
	        studentData.put("3", new Object[] { "129", "Teja", "2nd year" });
	  
	        studentData.put("4", new Object[] { "130", "Vaibhav","2nd year" });
	  
	        studentData.put("5", new Object[] { "131", "Karthik","2nd year" });
	  
	        studentData.put("6", new Object[] { "132", "Kalyan","2nd year" });
	  
	        Set<String> keyid = studentData.keySet();
	  
	        int rowid = 0;
	  
	        // writing the data into the sheets...
	  
	        for (String key : keyid) {
	  
	            row = spreadsheet.createRow(rowid++);
	            Object[] objectArr = studentData.get(key);
	            int cellid = 0;
	  
	            for (Object obj : objectArr) {
	                Cell cell = row.createCell(cellid++);
	                cell.setCellValue((String)obj);
	            }
	        }
	  
	        
	        FileOutputStream out = new FileOutputStream(new File("Egsheet.xlsx"));
	  
	        workbook.write(out);
	        out.close();
	    }
}
