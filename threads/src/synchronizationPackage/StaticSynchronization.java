package synchronizationPackage;

public class StaticSynchronization {
//if we declare static method as synchronized the lock will be appear on class not on object.
	synchronized static void add()
	{
		for(int i=1;i<4;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(500);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread{
	StaticSynchronization ss;
	public void run()
	{
	ss.add();	
	}
}

class Mythread2 extends Thread{
	StaticSynchronization ss;
	public void run() {
		ss.add();
	}
}
class Mythread3 extends Thread{
	StaticSynchronization ss;
	public void run() {
		ss.add();
	}
}
class Mythread4 extends Thread{
	StaticSynchronization ss;
	public void run() {
		ss.add();
	}
}

class TestStatSync
{
public static void main(String[] args) {
	MyThread1 mt1=new MyThread1();
	Mythread2 mt2=new Mythread2();
	Mythread3 mt3=new Mythread3();
	Mythread4 mt4=new Mythread4();
	mt1.start();
}	
}





