package threadsPackage;

public class ThreadTwice extends Thread{
 //if we call the thread twice it will executes for first time and second time it will throw an illegalThreadStateException
	public void run()
	{
		System.out.println("running");
	}
	public static void main(String[] args) {
		ThreadTwice tw=new ThreadTwice();
		tw.start();
		tw.start();
	}
}
