package com.niit.MultiThreading;

public class ThreadSync {

	private static int count;

	public void doWork() {
		Thread t1 = new Thread(new Runnable() {

			public void run() {

				for (int i = 0; i < 1000; i++) {
					incCount();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {

				for (int i = 0; i < 1000; i++) {
					incCount();
				}
			}

		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}

	public int getCount() {
		return count;
	}

	private void setCount(int i) {

		count = i;

	}

	public synchronized void incCount() {
		for (int i = 0; i < 1000; i++) {
			count++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadSync t = new ThreadSync();
		t.doWork();
		System.out.println("Count is :" + t.getCount());

	}

}
