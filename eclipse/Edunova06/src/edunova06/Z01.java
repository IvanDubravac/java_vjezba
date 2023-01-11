package edunova06;

public class Z01 {

	public static int najveci(int a, int b, int c) {

		if (a > b && a > c) {
			return a;
		}
		if (b > a && b > c) {

			return b;
		}

		return c;

	}
}