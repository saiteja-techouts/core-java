package abstractPackage;

public abstract class Example {
	abstract void run();
	void add()
	{
		System.out.println("this is addition method");
	}
	Example()
	{
		System.out.println("this is constructor");
	}
}
class E extends Example
{
	void run() {
		System.out.println("this is override method");
			}

}
class Tabstraction
{
public static void main(String[] args) {
	E e1=new E();
	e1.run();
}	
}
