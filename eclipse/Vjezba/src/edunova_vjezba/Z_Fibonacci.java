package edunova_vjezba;

public class Z_Fibonacci {
	public static void main(String[] args) {
		int suma = 0;
		int prvi = 0;
		int drugi = 1;
		int iduci = 1;

		for (int i = 1; i <= 32; i++) {
			iduci = prvi + drugi;
			prvi = drugi;
			drugi = iduci;

			if (iduci % 2 == 0) {
				suma += iduci;
			}

		}

		System.out.println(suma);
	}

}
