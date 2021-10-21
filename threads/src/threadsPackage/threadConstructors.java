package threadsPackage;
//Thread(String name)
public class threadConstructors {
//we can directly use the thread class to generate using the new constructors. 
	/*
	 * public void run() {
	 * System.out.println("I am using the thread(String name) constructor"); }
	 */
	public static void main(String[] args) {
		//here we need to create an object using constructor
		Thread t1=new Thread("my first thread");
		t1.start();
		//getting the thread name by invoking the getName()
		String str=t1.getName();
		System.out.println(str);
	}
}
