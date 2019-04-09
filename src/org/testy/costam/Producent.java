package org.testy.costam;

public class Producent extends Thread {
	private  Bufor  bufor;
	Producent(Bufor b, String  name) {
		super(name);
		this.bufor = b;
		setDaemon(true);
	}
	
	public void run() {
		int  produkt = 0;
		while(true) {
			produkt ++;
			try {
				sleep((int)(Math.random ()*100)+100);
			} catch(InterruptedException e){
				System.out.println("sleep  przerwane!");
			}
			//System.out.println(getName ()+" wyprodukowa³: " + produkt );
			System.out.println(getName ()+" > " + produkt );
			bufor.put(produkt );
		}
	}
}
