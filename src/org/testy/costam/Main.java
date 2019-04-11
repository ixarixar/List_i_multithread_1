package org.testy.costam;

public class Main {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(" - - - - - - - - - - - - - - - - - - - - - - S T A R T - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		
		Druk druk = Druk.getInstance();
		
		//rejestracja
		druk.addDrukarka("Drukarka-1", "172.16.26.20");
		
		//ksiêgowoœæ
		druk.addDrukarka("Drukarka2_dr-2", "172.16.26.21");
		
		
		druk.addZadanie("Drukarka-1", "A10,0,0,1,4,4,N,\" test1\"\nB10,50,0,2C,2,5,50,B,\"71830\"\n");

		
		
		
		
		
		
	}
	
	
	
	
}




