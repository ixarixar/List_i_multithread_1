package org.testy.costam;

import java.util.ArrayList;
import java.util.List;

public final class Druk extends Thread {
	
	private final Object lock = new Object();
	
	private static List<Integer> buf = new ArrayList<Integer>();;
	
	public static void add(int el){
		System.out.println("Dodaje zadanie " + el);
		buf.add(el);
		Thread t = new Thread();
		
		//Wyslij w = new Wyslij();
	}
	
	
	
	private class Wyslij extends Thread {
		public  void  run() {
			synchronized(lock) {
				
			}
			while(!buf.isEmpty()) {
				try {
					lock.wait();
					Thread.sleep(2000);
					lock.notify();
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
	
	
	
	
	
	
	
	
}
