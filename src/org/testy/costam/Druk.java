package org.testy.costam;

import java.util.ArrayList;
import java.util.List;

public final class Druk {
	
	private final Object lock = new Object();
	
	private static List<Integer> buf = new ArrayList<Integer>();;
	

	public static void add(int el){
		System.out.println("Dodaje zadanie " + el);
		buf.add(el);
		//Wyslij().start();
	}
	
	
	
	private class Wyslij extends Thread {
		public  void  run() {
			
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
