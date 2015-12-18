package math;

public class MathUtil {

	/**
	 * De grootste gemene deler, afgekort tot ggd, van 2 gegeven gehele getallen
	 * is het grootste gehele getal waar alle gegeven getallen door gedeeld kunnen worden.
	 * bvb ggd van 15 en 20 is 5
	 * 
	 * Je kan de ggd berekenen dmv het algoritme van Euclides.
	 * 1. Noem het grootste van beide getallen A, het andere B
	 * 2. Trek B net zo vaak van A af totdat er 0 over blijft of een getal kleiner dan B. (rest van gehele deling)
	 * 3. Wanneer er 0 overblijft zijn we klaar, en is B de ggd.
	 * 4. Zo niet, herhaal dan het algoritme met B en wat er overblijft van A.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int ggd(int a, int b) {
		throw new UnsupportedOperationException("implement me");
	}

}
