package threadsPackage;

public class ThreadJoining extends Thread{
//join method is used to wait for thread to die.
	public void run() {
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ThreadJoining tj=new ThreadJoining();
		ThreadJoining tj1=new ThreadJoining();
		tj.start();
		try {
			tj.join();
		}
		catch(Exception e)
		{
		System.out.println(e);	
		}
		tj1.start();
	}
}
