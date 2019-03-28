package glavni;

import java.util.Scanner;

public class Test_01_03_2019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// U nastavku je dat kod koji predstavlja kalkulator povrsina
		// kvadrata, pravougaonika i kruga.
		// Povrsina se bira tako sto se unese kao tekst odgovarajuca figura.
		// Ukoliko se unese 'izadji', program treba da se zavrsi.
		// Program treba da se ponavlja dokle god se ne unese izadji.

		Scanner sc = new Scanner(System.in);
		String figura;
		while (true) {
			System.out.println("Unesite ime figure za koju hocete da izracunate povrsinu...");
			System.out.println("Mozete odabrati : kvadrat, pravougaonuk i krug...");
			System.out.println("Unesite rec 'izadji' ako zelite da izadjete iz programa");
			figura = sc.nextLine();
			switch (figura) {
			case "kvadrat":
				racunajKvadrat();
				continue;
			case "pravougaonik":
				racunajPravougaonik();
				continue;
			case "krug":
				racunajKrug();
				continue;
			case "izadji":
				System.out.println("Kraj programa !");
				return;
			default:
				System.out.println("Nekorektan unos, probajte ponovo ...\n");
				continue;

			}
		}
	}

	private static void racunajKrug() {
		Scanner sc = new Scanner(System.in);
		double r;
		System.out.println("Unesite vrednost za poluprecnik kruga: ");
		r = sc.nextDouble();
		if (r <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina kruga je: " + pKruga(r) + "\n");
	}

	private static void racunajPravougaonik() {
		Scanner sc = new Scanner(System.in);
		double a, b;
		System.out.println("Unesite vrednost za duzinu stranice a: ");
		a = sc.nextDouble();
		System.out.println("Unesite vrednost za duzinu stranice b: ");
		b = sc.nextDouble();
		if (a <= 0 || b <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina pravougaonika je: " + pPravougaonika(a, b) + "\n");

	}

	private static void racunajKvadrat() {
		Scanner sc = new Scanner(System.in);
		double a;
		System.out.println("Unesite vrednost za duzinu stranice a: ");
		a = sc.nextDouble();
		if (a <= 0) {
			System.out.println("Los unos!");
			return;
		}
		System.out.println("Povrsina kvadrata je: " + pKvadrata(a) + "\n");

	}

	private static double pKruga(double r) {
		return r * r * 3.14;
	}

	private static double pKvadrata(double a) {
		return a * a;
	}

	private static double pPravougaonika(double a, double b) {
		return a * b;
	}

}
