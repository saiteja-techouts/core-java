package threadsPackage;

public class Aclass extends Thread{
   public void run() //run method is used to perform action of the thread
   {
	   System.out.println("this is run method");
   }
public static void main(String[] args) {
	Aclass ac=new Aclass();
	ac.start();//JVM calls the run method on the thread
}
}
