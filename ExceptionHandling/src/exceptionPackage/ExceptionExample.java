package exceptionPackage;

public class ExceptionExample {
public static void main(String[] args) {
	try {
		int a=59/0;
	}
	catch(Exception ref)//Exception is the super class of all exceptions.
	{
		System.out.println(ref);
		System.out.println("....");
	}
}
}
