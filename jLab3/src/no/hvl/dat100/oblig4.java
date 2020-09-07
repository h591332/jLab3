package no.hvl.dat100;

import java.util.Scanner;
import static java.lang.Double.parseDouble;
public class oblig4 {
	  public static void main(String[] args) {
		    @SuppressWarnings("resource")
			Scanner can = new Scanner(System.in);
		    System.out.println("Skriv inn bruttoinntekt");
			String biString = can.nextLine(); 
			double bi = parseDouble(biString);
		    if(bi<180800) {
		    	System.out.println("ingen trinnskatt: " + bi);
		    }
		    else if(bi>= 180800 && bi<254500) {
		    	double x;
		    	x= (bi/100)*1.9;
		    	System.out.println("Trinnskatt 1: " + (bi-x));
		    }
		    else if(bi>= 254500 && bi<639750) {
		    	double x;
		    	x= (bi/100)*4.2;
		    	System.out.println("Trinnskatt 2: " + (bi-x));
		    }
		    else if(bi>= 639750 && bi<999550) {
		    	double x;
		    	x= (bi/100)*13.2;
		    	System.out.println("Trinnskatt 3: " + (bi-x));
		    }
		    else{
		    	double x;
		    	x= (bi/100)*16.2;
		    	System.out.println("Trinnskatt 4: " + (bi-x));
		    }
	  }		    
	  }