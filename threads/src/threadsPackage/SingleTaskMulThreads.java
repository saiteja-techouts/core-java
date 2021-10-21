package threadsPackage;

public class SingleTaskMulThreads extends Thread {
	public void run()
	{
		System.out.println("single task");
	}
public static void main(String[] args) {
	SingleTaskMulThreads stt=new SingleTaskMulThreads();
	SingleTaskMulThreads stt1=new SingleTaskMulThreads();
	stt.start();
	stt1.start();
	
}
}
