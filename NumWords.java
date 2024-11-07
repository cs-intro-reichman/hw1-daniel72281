// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		  // created a var as arg to insert 3 digit numbre in terminal
		int a = Integer.parseInt(args[0]);
          // described the number by demand with a simple calculus  
		int hundreds = a/100;
		int tens = (a/10)%10;
		int ones = a%10;
		  //created a string and implemented inside the calc
		System.out.println(hundreds + " hundreds, " + tens +
		 " tens, " + ones + " ones. ");
			    
	}
}
