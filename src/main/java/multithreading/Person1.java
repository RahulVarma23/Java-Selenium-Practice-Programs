package multithreading;

 class Person1 extends Thread{
	 
	
	 @Override
	 public void run() {
		 printData();
	 }
	 
	public synchronized void printData() {
		for(int i =1;i<=500;i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}	
}
