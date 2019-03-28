package domaciPrvaNedelja;

import java.util.Scanner;

public class PrviZadatak {

    /*
    Napisati program koji proverava da li je uneti broj paran ili neparan.
    Ukoliko jeste, program treba da ispiše poruku: Broj je paran
    Ukoliko nije, program treba da ispiše poruku: Broj je neparan

    */
    
	static Scanner scan = new Scanner(System.in);
	static double number;
	static boolean checkForEndInput = true;
	//static String line;

	public static void main(String[] args) {

		while (checkForEndInput) {
			System.out.println("Proverite da li je �eljeni broj deljiv sa dva.\nUnesite broj 0 da izadjete iz programa");
			number = scan.nextDouble();
			if (number != 0) {
				System.out.println("Proverite da li je �eljeni broj deljiv sa dva.\nUnesite broj 0 da izadjete iz programa");
				checkIfNumberIsDividedByTwo();
			} else {
				checkForEndInput = false;
				System.out.println("Kraj programa !");
				scan.close();
			}
		}

	}

	private static void checkIfNumberIsDividedByTwo() {

		if (number % 2 == 0) {
			System.out.println("-----------------------------------------");
			System.out.println("Broj " + number + " je deljiv sa dva !");
			System.out.println("-----------------------------------------");
		} else {
			System.out.println("-----------------------------------------");
			System.out.println("Broj " + number + " nije deljiv sa dva !");
			System.out.println("-----------------------------------------");
		}
	}

}
