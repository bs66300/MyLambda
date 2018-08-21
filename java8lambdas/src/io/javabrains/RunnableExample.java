package io.javabrains;

public class RunnableExample {

	public static void main(String[] args) {
		 Thread myThread = new Thread( new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("inside Runnable");
			}
			 
		 });
		 
		 myThread.start();
		 
		 
		 Thread myThread2 = new Thread(() -> System.out.println("inside Runnable 2"));
		 myThread2.start();
	}
     
}
