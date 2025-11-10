// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		
		int terms = Integer.parseInt(args[0]);
		double piApprox = 1;
		double oddCount = 3;
		
		// Calculation of approx. pi / 4 (depending on amount of terms asked to check)
		// 1 is the first term, then it turns into either +/- 1/odd
		for (int i = 0; i < terms - 1; i++) {
			if (i % 2 == 0) {

				piApprox -= (1 / oddCount);
				oddCount += 2;

			} else {

				piApprox += (1 / oddCount);
				oddCount += 2;

			}
		}

		// Prints actual pi (approx. according to Java)
		System.out.println("pi according to Java: " + Math.PI);

		// Prints pi approx. (according to Gregory and Leibnitz and the amount of terms asked to check)
		System.out.println("pi, approximated:	 " + (4 * piApprox));
	}
}
