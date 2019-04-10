package org.testy.costam;

public class Main extends Thread{
	
	private int val;
	private Main(int val){
		this.val = val;
	}
	
	
	public void run(){
        System.out.println("T " + this.val);
        Druk druk = Druk.getInstance();
        druk.add(this.val);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - S T A R T - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		
		Druk druk = Druk.getInstance();
		
		for(int i=0; i<15; i++){
			druk.add(i);
			Thread.sleep(40);
		}
		
		
		/*
		
		for(int i=0; i<5; i++){
			(new Main(i)).start();
		}
		Thread.sleep(300);
		
		for(int i=5; i<10; i++){
			(new Main(i)).start();
		}
		Thread.sleep(300);
		
		for(int i=10; i<15; i++){
			(new Main(i)).start();
		}
		
		Thread.sleep(300);
		
		for(int i=15; i<20; i++){
			(new Main(i)).start();
		}
		
		
		*/
		
		
        
		/*
		Main m = new Main();
		m.new Wyslij().start();
		*/
		
        /*
		
		for(int i=1; i<10; i++){
			
			
			Thread thread = new Thread() {
			    public void run() {
			    	try {
						Thread.sleep((int)(Math.random ()*500)+10);
						Druk.add(i);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    	
			    }
			};

			thread.start();
			
			
			
			new Thread(() -> {
				try {
					Thread.sleep((int)(Math.random ()*500)+10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Druk.add(i);
			}).start();
			
			
			try {
				Thread.sleep((int)(Math.random ()*500)+10);
			} catch(InterruptedException e){
				System.out.println("sleep  przerwane!");
			}
			
			Druk.add(i);
			
		}
		
		
		*/
		
		
		
		/*
		Bufor bufor = new BuforMulti();
		for(int i = 1; i < 10; i++) {
			(new  Producent(bufor , "P" + i)). start ();
			(new  Konsument(bufor , "K" + i)). start ();
		}
		*/
		
	}
	
	
	
	
}




