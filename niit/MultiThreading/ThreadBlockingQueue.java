package com.niit.MultiThreading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Factory {

	BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

	void producer() {
		Random ran = new Random();
		try {
			while(true) {
				Thread.sleep(100);
				queue.put(ran.nextInt(50));
			}
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}

	void Consumer() {
		
		while (true) {
			try {
				Thread.sleep(1000);
				for(Integer i : queue)
				System.out.println(Thread.currentThread() + "Got this from Queue :" + queue.take() + "Queue size : " + queue.size());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadBlockingQueue {

	public static void main(String[] args) {

		System.out.println("  Main Thread :");

		final Factory myFactory = new Factory();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				myFactory.producer();
			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				myFactory.Consumer();
			}

		});
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				myFactory.Consumer();
			}

		});

		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("  End of Main Thread :");

	}

}
