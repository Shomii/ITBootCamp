package domaciPrvaNedelja;

import java.util.Scanner;

public class DrugiZadatak {
    
    /*
    Napisati program koji računa obim i površinu kruga.
    Formula za obim je: 2*r*pi
    Formula za površinu je r*r*pi
    */

	static Scanner scan = new Scanner(System.in);
	static double radius;
	static double pi = 3.14;
	static double obim;
	static double povrsina;

	public static void main(String[] args) {

		System.out.println("Izracunacemo obim i povr�inu kruga.\nUnesite koliko iznosi poluprecnik kruga:...");
		radius = scan.nextDouble();

		while (true) {
			if (radius < 0) {
				numberNotValid();
			} else if (radius > 0) {
				calculate();
				System.out.println("Za novi proracun, pokrenite program ponovo.");
				break;
			} else {
				question();
			}
		}
		
		scan.close();
	}

	private static void question() {
		radius = scan.nextDouble();
	}

	private static void calculate() {
		obim = 2 * radius * pi;
		System.out.println("Obim zadatog kruga je: " + String.format("%.2f", obim));
		povrsina = radius * radius * pi;
		System.out.println("Povrsina zadatog kruga je: " + String.format("%.2f", povrsina));
	}

	private static void numberNotValid() {
		System.out.println("Poluprecnik mora biti pozitivan!! Unesite ponovo poluprecnik: ");
		radius = scan.nextDouble();
	}

}
