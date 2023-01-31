package edunova;

import java.util.Scanner;

public class Start {

	public Start() {
		Pomocno.ulaz = new Scanner(System.in);
		pozdravnaPoruka();
		glavniIzbornik();

	}

	private void glavniIzbornik() {
		System.out.println();
		System.out.println("Dostupne opcije: ");
		System.out.println("1. Smjerovi");
		System.out.println("2. Grupe");
		System.out.println("3. Polaznici");
		System.out.println("4. Predavači");
		System.out.println("5. Izlaz iz programa");
		odabirGlavnogIzbornika();

	}

	private void odabirGlavnogIzbornika() {
		switch (Pomocno.unosBrojRaspon("Unesite broj", 1, 5)) {
		case 1:
			smjerovi.izbornik();
			break;

		case 5:
			System.out.println("Doviđenja!");
		}

	}

	private void pozdravnaPoruka() {
		System.out.println("Dobrodošli u Edunova terminal aplikaciju!");

	}

	public static void main(String[] args) {
		new Start();
	}
}
