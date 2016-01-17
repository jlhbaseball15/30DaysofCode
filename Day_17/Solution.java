import java.util.*;

class Calculator {
	int power(int n, int p) throws Exception {
		int number = 0;
		if (n > -1 && p > -1) {
			number = (int) Math.pow(n, p);
		} else {
			throw new Exception("n and p should be non-negative");
		}
		return number;
	}
}

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			int n = in.nextInt();
			int p = in.nextInt();
			Calculator myCalculator = new Calculator();
			try {
				int ans = myCalculator.power(n, p);
				System.out.println(ans);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
Status API Training Shop Blog About Pricing
