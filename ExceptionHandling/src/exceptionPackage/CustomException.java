package exceptionPackage;
import java.lang.*;

public class CustomException extends Exception {
  public CustomException(String s)
  {
	  
  }
}

class CustomException1
{
	void validate(int age) throws CustomException
	{
		if(age<18)
		{
			throw new CustomException("not applicable for bank account");
		}
		else
		{
			System.out.println("you are applicable for bank account");
		}
	}
	public static void main(String[] args) throws CustomException {
		CustomException1 c1=new CustomException1();
		c1.validate(13);
		
	}
	
}
