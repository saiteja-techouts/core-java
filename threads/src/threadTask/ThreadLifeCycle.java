package threadTask;

public class ThreadLifeCycle implements Runnable {
public void run()
{
	try {
		Thread.sleep(200);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
class threadState extends Thread{
	/*
	 * public static Thread t1; public static threadState ts;
	 */
	public static void main(String[] args) {
		threadState ts=new threadState();
		//Thread t1=new Thread(ts);
		System.out.println(ts.getState());
		ts.start();
		System.out.println(ts.getState());
	}
	public void run()
	{
		ThreadLifeCycle tlc=new ThreadLifeCycle();
		Thread t2=new Thread(tlc);
		System.out.println(t2.getState());
		t2.start();
		System.out.println(t2.getState());
		try
		{
			Thread.sleep(400);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(t2.getState());
		try
		{
			t2.join();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(t2.getState());
	}
}
