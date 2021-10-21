package threadsPackage;

public class NamingThread extends Thread {
//by default each thread having a name thread-0 and thread-1. we can change the name of thread by using setName.
	public void run() {
		System.out.println("changing the thread name");
	}

	public static void main(String[] args) {
		NamingThread nt=new NamingThread();
		System.out.println("before changing the thread-name :"+nt.getName());
		nt.start();
		nt.setName("SAITEJA");
		System.out.println("After changing the thread-name :"+nt.getName());
	}
}
