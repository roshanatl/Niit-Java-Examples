package com.niit.MultiThreading;

class MyRunnableThread implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 25; i++) {
			System.out.println("Value  is  :" + i);
			try {
				Thread.sleep(100);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadRunnable {

	public static void main(String[] args) {

		System.out.println(" Thread :" + 1);
		Thread t1 = new Thread(new MyRunnableThread());
		System.out.println(" Thread :" + 2);
		Thread t2 = new Thread(new MyRunnableThread());
		t1.start();
		t2.start();

	}

}
