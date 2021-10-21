package filePackage;

import java.io.File;

public class HiddenFile {
public static void main(String[] args) {
	File hide=new File("ABC");
	if(hide.isHidden())
	{
		System.out.println("the specified file is hidden");
	}
	else
	{
		System.out.println("the file is not hidden");
	}
}
}
