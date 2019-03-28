package domaciDrugaNedelja;

import java.util.Scanner;

public class DrugiZadatak {

    /*   
    Napisati program koji unosi 2 realna broja i operaciju kao karakter. 
    Program napisati na osnovu programa radjenog na casu 
    koristeci switch za izbor operacije. Voditi racuna oko deljenja
    */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double firstNumber, secondNumber;
		char operant;
		boolean calulateIsStillOn = true;
		// String end;

		while (calulateIsStillOn) {

			System.out.println("Unesite prvi broj: ");
			firstNumber = sc.nextDouble();

			if (firstNumber == 0) {
				System.out.println("Kraj programa !");
				break;
			}
			System.out.println("Unesite drugi broj: ");
			secondNumber = sc.nextDouble();

			System.out.println("Unesite operaciju: ");
			sc.nextLine();
			operant = sc.nextLine().charAt(0);

			switch (operant) {
			case '+':
				System.out.println("Zbir brojeva " + firstNumber + " i " + secondNumber + " je "
						+ (firstNumber + secondNumber) + '\n' + "Ukucaj nulu za prekid programa" + "\n\n");
				break;
			case '/':
				if (firstNumber != 0 & secondNumber != 0) {
					System.out.println("Kolicnik brojeva " + firstNumber + " i " + secondNumber + "jednako je "
							+ (firstNumber / secondNumber) + '\n' + "Ukucaj nulu za prekid programa" + "\n\n");
				} else {
					System.out.println("Deljenje nulom nije dozvoljeno" + '\n' + "Ukucaj nulu za prekid programa" + "\n\n");
				}
				break;
			case '-':
				System.out.println("Razlika brojeva " + firstNumber + " i " + secondNumber + "jednako je "
						+ (firstNumber - secondNumber) + '\n' + "Ukucaj nulu za prekid programa" + "\n\n");
				break;
			case '*':
				System.out.println("Proizvod brojeva " + firstNumber + " i " + secondNumber + "jednako je "
						+ (firstNumber * secondNumber) + '\n' + "Ukucaj nulu za prekid programa" + "\n\n");
				break;
			default:
				System.out.println("Nekorektan unos !!");
				break;
			}
		}
		sc.close();

	}

}
