// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// i converted 3 args into doubles
		double currentValue = Double.parseDouble(args[0]);
		double interestRate = Double.parseDouble(args[1]);
		double years = Double.parseDouble(args[2]);
		// uesd an equation to find the future value
		double futureValue = currentValue * Math.pow(1+interestRate/100,years);
		// i casted the args
		System.out.println("AAfter "  + ((int) years) + " years, a $" + ((int)currentValue) +" saved at " +
			interestRate + "%25 will yield $" + ((int) futureValue));
	}
}