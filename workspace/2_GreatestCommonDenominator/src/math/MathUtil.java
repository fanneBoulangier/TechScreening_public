package math;

public class MathUtil {

	/**
	 * The greatest common denominator, gcd, is the largest integer that can divide 2 given positive
	 * integer numbers.
	 * Example gcd of 15 and 20 is 5
	 * 
	 * The gcd can be calculated using the algorithm of Euclides
	 * 1. Take the maximum of A and B
	 * 2. Subtract B from A untill the remainder is 0 or smaller than B
	 * 3. When the remainder is 0, B is the gcd and we are done.
	 * 4. If not, repeat the algorithm with B and the remainder.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int gcd(int a, int b) {
		throw new UnsupportedOperationException("implement me");
	}

}
