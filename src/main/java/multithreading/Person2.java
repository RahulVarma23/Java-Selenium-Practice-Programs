package multithreading;

public class Person2 extends Thread {
	
	 @Override
	 public synchronized void run() {
		 printData();
	 }
	 
	public synchronized void printData() {
		
		for(int i =501;i<=600;i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Person2 p1 = new Person2();
		Person2 p2 = new Person2();
		
		p1.start();
		p2.start();
	}
}
