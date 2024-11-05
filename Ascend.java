// Generates three integer random numbers in a given range,
// and prints them in increasing order.
import java.util.Random;
public class Ascend {
	// I created a global object of type random
	public static Random rand = new Random();
	public static void main(String[] args) {
		// generate random integers in range 0 to 999
		int randomInt1 = rand.nextInt(1000);
		int randomInt2 = rand.nextInt(1000);
		int randomInt3 = rand.nextInt(1000);
		
		int max = Math.max(Math.max(randomInt2, randomInt3),randomInt1);
		int min = Math.min(Math.min(randomInt2, randomInt3),randomInt1);
		int middle = randomInt1 + randomInt2 + randomInt3 - max - min;
		System.out.println("the ascending order of int " + min + " " + middle +" " +max );

	
	}
}
