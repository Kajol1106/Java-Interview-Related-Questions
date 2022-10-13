package com.CreateThreadUsingRunnableInterface;

public class Main {

	public static void main(String[] args) {
	//3) Performing single task from single thread : 
		Thread1 t1 = new Thread1();
		Thread th1 = new Thread(t1);
		th1.start();
		
		Thread2 t2 = new Thread2();
		Thread th2 = new Thread(t2);
		th2.start();
	}

}


//1) Performing single task from single thread : 
//public class Main implements Runnable {
//	
//	@Override
//	public void run() {
//		System.out.println("Thread 1 is running...............");
//	}
//
//	public static void main(String[] args) {
//		Main m = new Main();
//		Thread t1 = new Thread(m);
//		t1.start();
//	}
//
//}



//3) Performing single task from multiple thread : 
//public class Main implements Runnable {
//	
//	@Override
//	public void run() {
//		System.out.println("Thread 1 is running...............");
//	}
//
//	public static void main(String[] args) {
//		Main m = new Main();
//		Thread t1 = new Thread(m);
//		t1.start();
//	}
//
//}
