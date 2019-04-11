package org.testy.costam;

import java.io.IOException;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;

public final class Druk {
	
	private static Druk INSTANCE;
		
	private List<Drukarka> drukarki;
	
	private Druk(){
		drukarki = new ArrayList<Drukarka>();
    }
	
    public static Druk getInstance() {
        if (INSTANCE == null)
            synchronized (Druk.class) {
                if (INSTANCE == null)
                    INSTANCE = new Druk();
            }
        return INSTANCE;
    }
    
    public class Drukarka{
    	private String hostName;
    	private String printerName;
    	
    	public Drukarka(String printerName, String hostName){
    		this.printerName = printerName;
    		this.hostName = hostName;
    	}
    	
    	public void setPrinterName(String printerName){
    		this.printerName = printerName;
    	}
    	public String getPrinterName(){
    		return this.printerName;
    	}
    	public void setHostName(String hostName){
    		this.hostName = hostName;
    	}
    	public String getHostName(){
    		return this.hostName;
    	}
    }
    
    
    /**
     * 
     * @param printerName - nazwa drukarki
     * @param hostName - nazwa hosta (adres ip)
     */
	public void addDrukarka(String printerName, String hostName) {
    	//System.out.println("addDrukarka: printerName: '" + printerName + "' hostName: '" + hostName + "'");
    	drukarki.add(new Drukarka(printerName, hostName));
	}

    
    
    /**
     * 
     * @param printerName - nazwa drukarki
     * @param data - dane do wydruku
     */
	public void addZadanie(String printerName, String data) {
		
		//szukamy drukarki w dodanych
		drukarki.forEach( el->{
			if(el.getPrinterName().equals(printerName)){
				
				//wydruk w nowym w¹tku 
				new Thread(()->{
					//System.out.println("        +" + "'" + nazwaDrukarki + "':" + w);
					
					//synchronizujemy wiele jednoczesnych wydruków - ¿eby siê nie nachodzi³y
					synchronized(el){
												
	        	    	try {
	    					//wait();
	    					Thread.sleep(100);
	    					
	    					LPR lpr = new LPR();	    					
	    					
	    					String printDada = "";
	    					printDada = "N\n";//Clear Image Buffer
	    					printDada+= "I8,B,048\n";//Character set selection - 8 bit data, B - Windows1250, 048 - country code 
	    					printDada+=data;
	    					printDada+="P1\n";//Print
	    								
	    					//System.out.print(el.getPrinterName() + ": " +printDada);
	    					
	    					lpr.printString(printDada, "", el.getHostName(), el.getPrinterName(), "");
	    					
	    					Thread.sleep(100);
	    					
	        	    	}catch(ConnectException e){
	        				e.printStackTrace();
	        			}catch(IOException e){
	        				e.printStackTrace();
	        			} catch (InterruptedException e) {
	    					e.printStackTrace();
	    				}
	    	    	}//synch
					
				}).start();
			}
		});
	}
	
	
}
