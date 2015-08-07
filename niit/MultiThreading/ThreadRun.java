package com.niit.MultiThreading;

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 25; i++) {
			System.out.println("Value  is  :" + i);
             try {
				sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}

}

public class ThreadRun {

	public static void main(String[] args) {
		
		System.out.println(" Thread :" +1);
		MyThread t1 = new MyThread();
		t1.start();
		System.out.println(" Thread :" +2);
		MyThread t2 = new MyThread();
		t2.start();
		
		
		
		

	}

}
