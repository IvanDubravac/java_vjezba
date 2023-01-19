package edunovaa07;

import edunova08.Pomocno;

public class Z01 {
	public static void main(String[] args) {
		int suma = 0;
		int ukupnoPredmeta = Pomocno.ucitajCijeliPozitivniBroj("Unesite ukupan broj predmeta za koji želite prosjek");

		for (int i = 0; i < ukupnoPredmeta; i++) {

			suma += Pomocno.ucitajCijeliBrojURasponu("Unesite " + (i + 1) + ". ocjenu", 1, 5);
		}

		System.out.println(suma / (float) ukupnoPredmeta);

	}

}
