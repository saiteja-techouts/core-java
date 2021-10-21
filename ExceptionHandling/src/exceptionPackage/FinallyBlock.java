package exceptionPackage;

public class FinallyBlock {
public static void main(String[] args) {
	try {
		int num=25/0;
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally {
		System.out.println("finally block will execute");
	}
	System.out.println("rem code");
}
}
