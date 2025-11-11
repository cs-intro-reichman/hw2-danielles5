// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

		// Recieves input and Verbose vs. Concise
		int seedN = Integer.parseInt(args[0]);
		String cOrV = args[1];	
		
		// Calculates and prints the Collatz conjecture in the requested format
		if ("vV".indexOf(cOrV) != -1) {

			for (int i = 1; i <= seedN; i++) {

				int seed = i;
				int counter = 1;
				System.out.print(seed + " ");

				do {
					if (seed % 2 == 0) {
						seed /= 2;
						counter++;
						System.out.print(seed + " ");
					} else {
						seed = (seed * 3) + 1;
						counter++;
						System.out.print(seed + " ");
					}
				} while (seed != 1);

				System.out.println("(" + counter + ")");
				if (i == seedN && seed == 1) {
					System.out.println("Every one of the first " + seedN + " hailstone sequences reached 1.");
				}
			}

		} else if ("cC".indexOf(cOrV) != -1) {

			for (int i = 1; i <= seedN; i++) {

				int seed = i;

				do {
					if (seed % 2 == 0) {
						seed /= 2;
					} else {
						seed = (seed * 3) + 1;
					}
				} while (seed != 1);

				if (i == seedN && seed == 1) {
					System.out.println("Every one of the first " + seedN + " hailstone sequences reached 1.");
				}

			}
		}		
	}
}
