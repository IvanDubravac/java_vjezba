package edunova06;

public class Z05 {
	public static double decimalni(double a, double b) {
		double znamenka1=0, znamenka2=0;
		while (a>1) {
			znamenka1 = a % 10;
			a = a / 10;
		}
		while (b > 1) {
			znamenka2 = b % 10;
			b =b / 10;
		}

		return znamenka1 + znamenka2;
	}

}
