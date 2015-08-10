package com.niit.MultiThreading;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

class Processor {

	private LinkedList<Integer> myList = new LinkedList<>();
	private static final int LIMIT = 3;
	private Object lock = new Object();

	AtomicInteger i = new AtomicInteger(2);
	AtomicInteger out = new AtomicInteger(2);

	void producer() throws InterruptedException {
		Random ran = new Random();
		while (this.i.get()>0) {
			synchronized (lock) {
				if (myList.size() == LIMIT) {
					System.out.println("Put one Set ");
					System.out.println(myList);
					this.i.decrementAndGet();
					lock.wait();
				}				
				myList.add(ran.nextInt(1000));
				System.out.println("Count=" +this.i);
				lock.notify();
			}
		}
	}

	void Consumer() throws InterruptedException {
		while (this.out.get()>0) {

			synchronized (lock) {

				if (myList.isEmpty()) {
					// System.out.println("Consumer is waiting ");
					this.i.decrementAndGet();
					lock.wait();
				}
				
				System.out.println(Thread.currentThread() + "Got this from list  :" + myList.removeFirst());
				
				lock.notify();
			}
			// System.out.println("Consumer is Busy Sleeping ");
			Thread.sleep(1000);
			// System.out.println("Consumer is Back ");
		}
	}
}

public class ThreadWaitNotify {

	public static void main(String[] args) {

		System.out.println("  Main Thread :");

		final Processor myFactory = new Processor();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					myFactory.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					myFactory.Consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					myFactory.Consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});
		Thread t4 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					myFactory.Consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		t1.start();
		t2.start();
		t3.start();
		t4.start();

		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("  End of Main Thread :");

	}

}
