package exceptionPackage;

public class ThrowException {
//it is used to throw an exception explicitly
	void approve(int age) throws Exception {
	if(age<18)
	{
		throw new Exception("not eligible for bank account");
	}
	else 
	{
		System.out.println("eligible for bank account");
	}
	}
	public static void main(String[] args) throws Exception {
		ThrowException t1=new ThrowException();
		t1.approve(13);
	}
	
}
