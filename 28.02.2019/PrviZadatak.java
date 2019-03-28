package domaci_28_02_2019;

import java.util.Scanner;

/**
 * Korisnik ucitava niz od N elemenata niza. Napisati 2 metode Prva metoda
 * ispisuje elemente niza koji su deljivi sa 3 Druga metoda ispisuje elemente
 * niza koji su deljivi sa 5
 *
 * ili
 *
 * Napredno: Korisnik ucitava niz od N elemenata niza, kao i nekoi broj br.
 * Napisati metodu koja ispisuje elemente niza deljive sa brojem br
 *
 *
 */
public class PrviZadatak {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);
        int numberOfElements;

        System.out.println("Upisite koliko elementa ima niz >");
        numberOfElements = scan.nextInt();

        int[] ourArray = new int[numberOfElements];

        for (int i = 0; i < ourArray.length; i++) {
            System.out.println("Upisite " + (i + 1) + " element niza >");
            ourArray[i] = scan.nextInt();
        }

        returnNumbersDividedByThree(ourArray, numberOfElements);
        returnNumbersDividedByFive(ourArray, numberOfElements);
        returnNumbersDividedByUserChoice(ourArray, numberOfElements);

        scan.close();
    }

    public static void returnNumbersDividedByThree(int[] arraysNumbers, int numbers) {

        System.out.print("\nNiz sadrzi sledece elemente deljive sa brojem tri: ");
        for (int i = 0; i < numbers; i++) {
            if (arraysNumbers[i] % 3 == 0) {
                System.out.print(arraysNumbers[i] + " ");
            }
        }
    }

    public static void returnNumbersDividedByFive(int[] arraysNumbers, int numbers) {

        System.out.print("\nNiz sadrzi sledece elemente deljive sa brojem pet: ");
        for (int j = 0; j < numbers; j++) {
            if (arraysNumbers[j] % 5 == 0) {
                System.out.print(arraysNumbers[j] + " ");
            }
        }
    }

    public static void returnNumbersDividedByUserChoice(int[] arraysNumbers, int numbers) {

        System.out.println("\nUpisite broj sa kojim cete proveriti deljivost elemenata niza >");
        int divide = scan.nextInt();

        System.out.print("\nNiz sadrzi sledece elemente deljive sa brojem " + divide + " : ");
        for (int k = 0; k < numbers; k++) {

            if (arraysNumbers[k] % divide == 0) {
                System.out.print(arraysNumbers[k] + " ");
            }
        }
    }
}
