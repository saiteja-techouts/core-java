package threadsPackage;

public class IsDaemon extends Thread {
/*daemon thread is used to provide services for user threads. if user thread dies daemon thread will terminated 
	automatically by jvm*/
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			try
			{
				Thread thread = new Thread();
				thread.isDaemon();
			}
			catch(Exception e)
			{
				System.out.println(e+"daemon thread");
			}
		}
	}
	public static void main(String[] args) {
		IsDaemon id=new IsDaemon();
		id.setDaemon(true);
		id.start();
	}
}
