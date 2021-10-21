package threadsPackage;

public class MulTaskMulThreads extends Thread {
	public void run() {
		System.out.println("first task");
	}
}

 class MultipleTask extends Thread{
	public void run()
	{
		System.out.println("second task");
	}
	
}
 class test{
	 public static void main(String[] args) {
		MultipleTask m1=new MultipleTask();
		m1.start();
	}
 }
