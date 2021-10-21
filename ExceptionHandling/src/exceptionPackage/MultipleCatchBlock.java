package exceptionPackage;

public class MultipleCatchBlock {
	public static void main(String[] args) {
		try {
			int[] a={1,2,3,4,5};
			System.out.println(a[5]);
			a[10]=30/0;
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bounds exception");
		}
		catch (Exception e) {
			System.out.println("arithmetic exception");
		}
		System.out.println("...");
	}

}
