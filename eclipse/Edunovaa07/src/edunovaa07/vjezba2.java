package edunovaa07;

public class vjezba2 {
	public static void main(String[] args) {

		int suma = 0;

		int ukupanBrojPredmeta = metode1.ucitajCijeliPozitivniBroj("Unesite broj predmeta u školi");

		for (int i = 0; i < ukupanBrojPredmeta; i++) {
			suma += metode1.ucitajCijeliBrojURasponu("Unesite " + (i + 1) + ". ocjenu", 1, 5);
		}
		System.out.println(suma/(float)ukupanBrojPredmeta);
	}

}
