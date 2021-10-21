package threadsPackage;

public class Brunnable implements Runnable {
  public void run()
  {
	  System.out.println("this is runnanble");
  }
  public static void main(String[] args) {
	//if the class is not extending from the thread we need to create thread object explicitly.
	  Brunnable br=new Brunnable();
	  Thread t1=new Thread(br);
	  t1.start();
}
}
