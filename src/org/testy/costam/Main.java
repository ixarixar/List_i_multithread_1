package org.testy.costam;

public class Main {
	
	
	
	public static void main(String[] args)  {
		
		
		Druk druk = Druk.getInstance();
		
		
		//dodaj drukarkê
		druk.addDrukarka("Drukarka-1", "172.16.26.20");
		
		//dodaj drukarkê
		druk.addDrukarka("Drukarka2_dr-2", "172.16.26.21");
		
		
		
		
		druk.addZadanie("Drukarka-1", ""
				+ "A10,0,0,1,3,3,N,\" test1\"\n"
				+ "B10,50,0,2C,2,5,50,B,\"71830\"\n");
		
		
		/*
		 * bar-2d ??
		druk.addZadanie("Drukarka-1", ""
				//+ "A10,0,0,1,2,2,N,\" test2\"\n"
				+ "b10,40,A,d9,\"test2\"\n");
				*/

		
		
		
		
	}
	
	
	
	
}




