package threadsPackage;

//thread(runnable r,String Name)
public class ThreadConstructorsRunnable implements Runnable {
	public void run() {
		System.out.println("it is thread constructor passing two arguments");
	}

	public static void main(String[] args) {
		ThreadConstructorsRunnable tcr=new ThreadConstructorsRunnable();
		Thread t1=new Thread(tcr,"this is my constructor");
		t1.start();
		String str=t1.getName();
		System.out.println(str);
	}
}
