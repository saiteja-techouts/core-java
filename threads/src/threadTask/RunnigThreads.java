package threadTask;

public class RunnigThreads {
	//@SuppressWarnings("static-access")
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Thread threadOne=new Thread(new RunnigThreads().new Thread1());
		Thread threadTwo=new Thread(new RunnigThreads().new Thread2());
		Thread threadThree=new Thread(new RunnigThreads().new Thread3());
		threadOne.setDaemon(true);
		
		threadOne.start();
		threadOne.setName("SAITEJA");
		threadTwo.start();
		System.out.println(threadOne.getName());
		System.out.println(threadTwo.currentThread().getName());
		
	}
	class Thread1 implements Runnable{
		public void run() {
			System.out.println(Thread.currentThread().isDaemon());
			
		}
	}
	class Thread2 implements Runnable{
		public void run()
		{		
			System.out.println(Thread.currentThread().getName());
		}
	}
	class Thread3 implements Runnable{
		public void run()
		{		
			System.out.println(Thread.currentThread().getName());
		}
	}
}


