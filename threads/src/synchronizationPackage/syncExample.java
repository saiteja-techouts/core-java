package synchronizationPackage;

public class syncExample {
//synchronization has the capability to control the access of multiple threads to any shared resource.
	//wap for synchronized data..
	synchronized void printTable(int n){//synchronized method  
		   for(int i=1;i<=5;i++){  
		     System.out.println(n*i);  
		     try{  
		      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
		   }  
		  
		 }  
		}  
		  
		class MyThread1 extends Thread{  
		syncExample se;  
		MyThread1(syncExample t){  
		se=t;  
		}  
		public void run(){  
		se.printTable(5);  
		}  
		  
		}  
		class MyThread2 extends Thread{  
		syncExample se1;  
		MyThread2(syncExample t1){  
		se1=t1;  
		}  
		public void run(){  
		se1.printTable(100);  
		}  
		}  
		  
	     class TestSynchronization2{  
		public static void main(String args[]){  
		syncExample obj = new syncExample();//only one object  
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  
		}  
}
