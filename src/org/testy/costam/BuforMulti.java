package org.testy.costam;

public class BuforMulti implements Bufor{

	private  int  product;
	private  boolean  pusty = true;
	
	synchronized public void put(int p) {
		while(! pusty) {
			try { wait (); }
			catch(InterruptedException e) {}
		}
		product = p;
		pusty = false;
		notifyAll ();
	}
	
	synchronized public int get() {
		while(pusty) {
			try { wait (); }
			catch(InterruptedException e) {}
		}
		pusty = true;
		notifyAll ();
		return  product;
	}

}
