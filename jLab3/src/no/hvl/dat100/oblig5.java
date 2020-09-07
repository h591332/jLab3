package no.hvl.dat100;
import java.util.Scanner;

public class oblig5 {
	  public static void main(String[] args){
		  
		  @SuppressWarnings("resource")
		Scanner can = new Scanner(System.in);
		  System.out.println("Skriv inn poengsummen din");
		  
		  Double pSum = can.nextDouble();
		  
		  
		  if (pSum<=100 && pSum>=90) {
			  System.out.println("Du fikk A");
		  }
		  else if (pSum<=89 && pSum>=90) {
			  System.out.println("Du fikk b");
		  }
		  else if (pSum<=79 && pSum>=60) {
			  System.out.println("Du fikk c");
		  }
		  else if (pSum<=59 && pSum>=50) {
			  System.out.println("Du fikk d");
		  }
		  else if (pSum<=49 && pSum>=40) {
			  System.out.println("Du fikk e");
		  }
		  else if (pSum<=39 && pSum>=0) {
			  System.out.println("Du fikk f");
		  }
		  else {
			  System.out.println("Det du skrev inn er ikke gyldig");
			  
		  }
		  
	  }
}