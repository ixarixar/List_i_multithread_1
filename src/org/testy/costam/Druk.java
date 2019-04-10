package org.testy.costam;

import java.util.ArrayList;
import java.util.List;

public final class Druk {
	
	private static Druk INSTANCE;
	
	private Object lock = new Object();
	private List<Integer> kolejka = new ArrayList<Integer>();
	
	private Druk(){
    }

	
    public static Druk getInstance() {
        if (INSTANCE == null)
            synchronized (Druk.class) {
                if (INSTANCE == null)
                    INSTANCE = new Druk();
            }
        return INSTANCE;
    }
    
    public void add(int value){
    	kolejka.add(value);
    	System.out.println("+ " + value);
    	
    	Thread t = new Thread(new Runnable() {
    	    public void run() {
    	    	
    	    	synchronized(lock){
    	    		System.out.print("\n" + value + " . . .");
        	    	try {
    					//wait();
    					Thread.sleep(1000);
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    				}
        	    	System.out.println(". . . " + value);
    	    	}
    	    	
    	    }
    	});

    	t.start();
    	
    }


	
	
}
