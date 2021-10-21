package threadsPackage;

public class SleepMethod implements Runnable {
//sleep method must be enclosed with the try/catch blocks or must be specified with throw clause
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				System.out.println(ie);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		SleepMethod sm = new SleepMethod();
		Thread t1 = new Thread(sm);
		t1.start();

	}
}
