package com.hcl.javabasicadvanced.thread;

import java.util.HashSet;
import java.util.Set;

public class Main extends Thread {
	public static int amount = 0;

	public static void main(String[] args) {
		
		Set<Thread> set = new HashSet<Thread>();
		
		set.add(new Main());
		set.add(new Main());
		set.add(new Main());
		set.add(new Main());
		set.add(new Main());
		set.add(new Main());
		
		for(Thread thread: set) {
			thread.start();
		}
		
		/*for(Thread thread: set) {
			while (thread.isAlive()) {
				System.out.println("Waiting...");
			}
		}*/
		// Wait for the thread to finish
		
		// Update amount and print its value
		System.out.println("&&&&&Main: " + amount);
		amount++;
		System.out.println("&&&&&Main: " + amount);
	}

	public void run() {
		amount++;
		try {
			System.out.println("Thread started " + this.getId());
			System.out.println("amount value before sleep" + amount);
			Thread.sleep(2);
			System.out.println("Thread ended " + this.getId());
			System.out.println("amount value after sleep" + amount);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
