package edunova_vjezba;

public class PE01 {
	public static void main(String[] args) {

		int zbroj = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				zbroj += i;
			
			}

		}
		System.out.println(zbroj);
	}
}
