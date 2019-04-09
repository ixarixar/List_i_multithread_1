package org.testy.costam;




public class Main extends Thread{
	
	
	private int val;
	private Main(int val){
		this.val = val;
	}
	
	
	public void run(){
		try {
			Thread.sleep((int)(Math.random ()*20)+5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println("Therad " + this.val);
	}
	
	
	

	
	
	
	public static void main(String[] args) {
		
		for(int i=0; i<10; i++){
			(new Main(i)).start();
		}
		 
        
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




