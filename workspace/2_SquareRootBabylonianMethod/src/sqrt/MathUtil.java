package sqrt;

public class MathUtil {

	/**
	 * Calculate the square root of a given number with the Babylonian method:
	 *  sqrt(S) can be calculated as follows:
	 * 1. Choose an arbitrary positive initial value x0
	 * 2. xn+1 is the average of xn and S/xn
	 * 3. repeat step 1 and 2 until the accuracy is sufficient (i.e. untill xn^2 gets near to S).
	 *
	 * Calculate the sqrt up to eight decimal precision.
	 *
	 * mathematical notation:
	 * x0 = sqrt(S)
	 * xn+1 = 1/2 * (xn + S / xn)
	 * sqrt(S) = lim (n->infinit) xn
	 * 
	 * @param aNumber a number
	 * @return the square root of a number up to 8 decimal precision
	 */
	public static double sqrt(double aNumber) {
		throw new UnsupportedOperationException("implement me");
	}
	
}
