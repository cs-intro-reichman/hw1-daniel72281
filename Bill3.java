// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// i took 4 args from terminal and converted them into 4 vars:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		// converted the bill to double 
		double bill = Double.parseDouble(args[3]) / 3.0;
		bill = Math.ceil(bill);
	    System.out.println("Dear "  + name1 + " " + name2 +" " +name3 + ": pay " + 
				bill + " Shekels each.  ");
		

	}
}
