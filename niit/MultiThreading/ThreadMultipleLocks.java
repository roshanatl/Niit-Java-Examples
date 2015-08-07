package com.niit.MultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadMultipleLocks {
	Object lock1 = new Object();
	Object lock2 = new Object();

	private List<Integer> list1 = new ArrayList<>();
	private List<Integer> list2 = new ArrayList<>();

	Random ran = new Random(100);

	 void processOne() {
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list1.add(ran.nextInt());
		}

	}

	 void processTwo() {
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list2.add(ran.nextInt());
		}
	}

	public void doWork() {
		Thread t1 = new Thread(new Runnable() {

			public void run() {

				for (int i = 0; i < 1000; i++) {
					processOne();
					processTwo();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {

				for (int i = 0; i < 1000; i++) {
					processOne();
					processTwo();
				}
			}

		});

		long start = System.currentTimeMillis();
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();

		System.out.println("Time is : " + (end - start));
		System.out.println("List 1 :" + list1.size());
		System.out.println("List 2 :" + list2.size());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadMultipleLocks t = new ThreadMultipleLocks();
		t.doWork();

	}

}
