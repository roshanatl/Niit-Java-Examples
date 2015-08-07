package com.niit.MultiThreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tasks implements Runnable {
	CountDownLatch c;

	Tasks(CountDownLatch c) {
		this.c = c;
	}

	@Override
	public void run() {
		System.out.println("Starding thread  = " + Thread.currentThread() + " Latch : " + c.getCount() );
		

			for (int i = 0; i < 5; i++) {
				System.out.println("Step :" + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Sleep interepted .. Ignor");
				}
			}
				
				c.countDown();
		System.out.println("Ending thread thread  = " + Thread.currentThread() + " : ");
	

}
}

public class ThreadCountDownLatch {

	public static void main(String[] args) {

		System.out.println("  Main Thread :");
		CountDownLatch latch = new CountDownLatch(10);
		// This will create 3 threads in pool .
		ExecutorService executor = Executors.newFixedThreadPool(3);
		// This will create 6 threads at the start up
		// ExecutorService executor = Executors.newCachedThreadPool();

		for (int i = 0; i < 20; i++) {
			executor.execute(new Tasks(latch));
		}
		System.out.println("  Waiting for tasks  to complete :");
		try {
			latch.await();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("  *******************************Shutting down**************");
		executor.shutdownNow();
		//executor.shutdown();

		System.out.println("  End of Main Thread :");

	}

}
