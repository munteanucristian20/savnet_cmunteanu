package Test;

public class problema1 {

	public static void main(String[] args) {
		System.out.println(harmonicAvg(7, 8));
	}

	public static double harmonicAvg(int a, int b) {

		if (a + b == 0) {

			return 0;

		} else {

			return (double) (2 * a * b) / (a + b);
		}
	}
}
