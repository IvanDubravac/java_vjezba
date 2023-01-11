package edunova06;

public class E01_VrsteMetoda {

	public static void m1_Pozdravi() {
		for (int i = 0; i < 10; i++) {
			System.out.print("Hello" + " ");
		}

	}

	public static int m2_slucajniBroj() {

		int sb = (int) (Math.random() * 100);

		return sb;
	}

	public static void m3_alg43(int a, int b, int c) {
		int r = a + b;
		float f = r / c;
		System.out.println(f * 10);

	}

	public static boolean m4_prim(int broj) {
		for (int i = 2; i < broj; i++) {
			if (broj % i == 0) {
				return false;
			}
		}

		return true;
	}
}
