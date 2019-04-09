package org.testy.costam;

public class Konsument extends Thread {
	private  Bufor  bufor;
	Konsument(Bufor b, String  name) {
		super(name);
		this.bufor = b;
	}
	public  void  run() {
		for(int i = 0; i< 10; i++) {
			try {
				sleep((int)(Math.random ()*100)+100);
			} catch(InterruptedException e){
				System.out.println("sleep  przerwane!");
			}
			int  produkt = bufor.get ();
			//System.out.println(getName ()+" skonsumowa³: " + produkt );
			System.out.println("     " + produkt + " > " + getName ());
		}
	}
}
