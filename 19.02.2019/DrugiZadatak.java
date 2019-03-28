package domaciDrugaNedelja;

import java.util.Scanner;

public class DrugiZadatak {

    /*
    Napisati program koji unosi i sabira brojeve dokle god nije unesen broj koji je negativan.
    Na primer ako se unese 1 2 5 3 -1 program treba da ispise 11

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int brojZaRacunanje = 0;
        int rezultatSabiranja = 0;
        int ukupnoBrojeva = 0;

        while (true) {
            System.out.println("Unesite broj za racunanje: ");
            brojZaRacunanje = scan.nextInt();

            if (brojZaRacunanje > 0) {
                ukupnoBrojeva += 1;
                rezultatSabiranja += brojZaRacunanje;
            } else {
                System.out.println("Zbir " + ukupnoBrojeva + " uneta broja je " + rezultatSabiranja + "\n\n");

                System.out.println("Da li zelite da ponovite?\nUpisite d ako zelite ponovo ili\nbilo koje dugme za prekid programa");
                String dalje;
                scan.nextLine();
                dalje = scan.nextLine().toLowerCase();
                if ("d".equals(dalje)) {
                    ukupnoBrojeva = 0;
                    rezultatSabiranja = 0;
                    continue; // nije potrebno za pravilan rad programa, ali je stavljeno zbog preglednosti
                } else {
                    System.out.println("Kraj programa");
                    break;
                }

            }
        }
        scan.close();
    }

}
