package threadsPackage;

public class CurrentThread extends Thread {
//current thread returns the reference of the currently executing thread object
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		CurrentThread ct=new CurrentThread();
		CurrentThread ct1=new CurrentThread();
		ct.start();
		ct1.start();
	}
}
