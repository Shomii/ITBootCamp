package domaci_21_02_2019;

import java.util.Scanner;

public class PrviZadatak {

	/*
	 * Napisati program koji racuna sumu brojeva od 1 do n koristeci for petlju, gde
	 * korisnik unosi broj n;
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n;
		int zbir = 0;
		boolean isAdding = true;

		for (;isAdding;) {
			System.out.println("Unesite broj za sabiranje: \nili unesite broj 0 za kraj programa");
			n = scan.nextInt();
			if (n >= 0) {
				if (n != 0) {
					zbir = 0;
					for (int i = 0; i <= n; i++) {
						zbir += i;
					}
					System.out.println("Zbir svih brojeva od 1 do " + n + " je " + zbir + "\n\n");
				} else if (n == 0) {
					isAdding = false;
					System.out.println("Kraj programa");
				}
			} else {
				System.out.println("Broj mora biti veci od nule.\nProbajte ponovo...\n\n");
			}
		}
		scan.close();
	}

}
