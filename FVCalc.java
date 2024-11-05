// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double currentValue = Double.parseDouble(args[0]);
		double interestRate = Double.parseDouble(args[1]);
		double years = Double.parseDouble(args[2]);
		double futureValue = currentValue * Math.pow(1+interestRate/100,years);
		System.out.println("after "  + ((int) years) + " years " + ((int)currentValue) +"$ saved at " +
			interestRate + "% will yield " + ((int) futureValue) + "$ ");
	}
}