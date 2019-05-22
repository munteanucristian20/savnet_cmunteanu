package Test;

public class problema2 {
	public static void main(String[] args) {

		int x[] = { 1, 2, 3, 4, 5 };
		int y[] = { 2, 3, 0, 3, 7 };
		System.out.println(isSorted(x));
		System.out.println(isSorted(y));
	}

	public static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
