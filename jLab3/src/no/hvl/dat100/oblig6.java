package no.hvl.dat100;

import java.util.Scanner;

public class oblig6 {
	  public static void main(String[] args){
		  
		  @SuppressWarnings("resource")
		Scanner can = new Scanner(System.in);
		  System.out.println("Skriv inn et tall så gjør jeg fakulteten til tallet");
		  
		  int pSum = can.nextInt();
		  
		  if(pSum<=0 || pSum>17) {
			  System.out.println("du kan ikke ta fakultet av 0 eller mindre, og det er en grense på 17");
		  }
		  else {
			 int svar=fakultet(pSum);
			  
			  System.out.println(svar);
			  
			  
			  
		  }
	  }
	  private static int fakultet(int a) {
		 int temp=1;
		 
		 while(a>1) {
			 temp *=a;
			 a--;
		 }
		 return temp;
		 
		  
		  
	  }
}
