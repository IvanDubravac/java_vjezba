package edunova_vjezba;

public class Z_Ponavljanje_15x15 {
	public static void main(String[] args) {
		int tablica[][] = new int[16][16];

		for (int i = 1; i <= 15; i++) {
			for (int j = 1; j <= 15; j++) {
				tablica[i][j] = i * j;
				if (tablica[i][j] >= 10 && tablica[i][j] <= 100) {
					System.out.print(tablica[i][j] + "        ");
				} else if (tablica[i][j] >= 100 && tablica[i][j] <= 300) {
					System.out.print(tablica[i][j] + "  ");
				} else {
					System.out.print("    "+ tablica[i][j] + "    ");
				}
			}
			System.out.println();
		}

	}

}
