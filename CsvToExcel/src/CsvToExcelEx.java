import com.aspose.cells.FileFormatType;
import com.aspose.cells.LoadOptions;
import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;

public class CsvToExcelEx 
{
	

	public static void main(String[] args) throws Exception
	{
		// Opening CSV Files
		// Creating CSV LoadOptions object
		LoadOptions loadOptions = new LoadOptions();
		String dataDir;
		// Creating an Workbook object with CSV file path and the loadOptions
		// object
		Workbook workbook = new Workbook("C:\\Users\\D1\\Desktop\\CSVDemo.csv", loadOptions);
		workbook.save( "CSVtoExcel.xlsx" , SaveFormat.XLSX); 
	}
}
