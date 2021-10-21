package filePackage;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;

public class LastModifiedDate {
	public static void main(String[] args)throws Exception {
	    
	    File f = new File("teja.txt");

	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	  
	    System.out.println("File last modified date " + sdf.format(f.lastModified()));
	        
	    
	    Path path = Paths.get("teja.txt");
	    BasicFileAttributes attr;
	    
	      attr = Files.readAttributes(path, BasicFileAttributes.class);
	      
	      System.out.println("File creation time - " 
	        + sdf.format(attr.creationTime().toMillis()));
	      
	      System.out.println("File modified time - " 
	        + sdf.format(attr.lastModifiedTime().toMillis()));        
	          
	  }
}
