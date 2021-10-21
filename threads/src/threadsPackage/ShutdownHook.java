package threadsPackage;

public class ShutdownHook extends Thread {
//if we want to execute some code before jvm shutdown we use shutdown hook 
	public void run()
	{
		System.out.println("shutdown");
	}
}
class TestShut{
	public static void main(String[] args) {
		//addShutdownHook is a method of runtime class
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(new ShutdownHook());//the method that returns a instance of a class is factory method
		System.out.println("hi");
	}
}