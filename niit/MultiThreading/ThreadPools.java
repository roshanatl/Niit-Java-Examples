package com.niit.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {
	private int id;

	Task(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("Starding thread  = "+Thread.currentThread()+" : "  + id);
		try {
			
			for(int i=0;i<5;i++)
			{
				System.out.println("Thread : " + id + "Step :" + i);
				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ending thread thread  = "+Thread.currentThread()+" : " + id);
	}

}

public class ThreadPools {

	public static void main(String[] args) {

		System.out.println("  Main Thread :" );
		//This will create 3 threads in pool .
		ExecutorService executor = Executors.newFixedThreadPool(3);
		//This will create 6 threads at the start up
		//ExecutorService executor = Executors.newCachedThreadPool();
		
		for(int i=0;i<6;i++)
		{
			executor.execute(new Task(i));
		}
		System.out.println("  Waiting for tasks  to complete :" );
		
		executor.shutdown();
		try {
			 executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
			} catch (InterruptedException e) {
			 
			}
		System.out.println("  End of Main Thread :" );		

	}

}
