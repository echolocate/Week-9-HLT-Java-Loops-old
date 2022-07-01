import java.util.Scanner;

public class guessingGame {

	public static void main(String[] args) {
	      int min = 1;
	      int max = 100;
	      boolean userGuess = false;	      
	      Scanner sc = new Scanner(System.in);
	      
	      //Generate random int value from 1 to 100
	      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
	      // System.out.println(random_int);
	      System.out.println("How old do you think I am?: ");
	      while (userGuess == false) {
	    	  int guess = sc.nextInt();
	    	  if (guess < random_int) {
	    		  System.out.println("Charmer ! Try guessing a little older...");
	    		  userGuess = false;
	    	  }
	    	  
	    	  else if (guess > random_int) {
	    		  System.out.println("How dare you!!! I'm younger than that...");
	    		  userGuess = false;  
	    		  }
	    	  
	    	  else {
	    		  System.out.println("Spot on !!! How did you guess ?");
	    		  userGuess = true;
	    	  }
	      }
	    	  
	 }
}


