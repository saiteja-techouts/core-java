package synchronizationPackage;

public class SynchronizedBlock {
//java synchronizedBlock is more efficient than synchronizedMethod.
	// synchronizedBlock is used to perform synchronization on any specific resource
	// of method.
	void add(int x) {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(x + i);
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class myThread extends Thread {
	SynchronizedBlock sb;
	public myThread(SynchronizedBlock sb) {
       this.sb=sb;
	}
	public void run()
	{
		sb.add(4);
	}
}

class myThread1 extends Thread{
	SynchronizedBlock sb1;
	public myThread1(SynchronizedBlock sb) {
	sb1=sb;
	}
	public void run()
	{
		sb1.add(5);
	}
}

class TestSynBlock
{
	public static void main(String[] args) {
		SynchronizedBlock sb=new SynchronizedBlock();
		myThread mt=new myThread(sb);
		myThread1 mt1=new myThread1(sb);
		mt.start();
		//mt1.start();
	}
}







