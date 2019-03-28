package domaciDrugaNedelja; 

import java.util.Scanner; 

public class PrviZadatak {

/*
    Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva od 0 do n. Koristiti jednu petlju
    */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 
		int brojZaRacunanje; 
		System.out.println("Unesite broj za racunanje: "); 
		brojZaRacunanje = scan.nextInt(); 
		int rezultatSabiranja = 0; 
		int rezultatMnozenja = 1; 
		int i = 0; 
                
                    
		while (i <= brojZaRacunanje) {

			if (i % 2 == 0) {
				rezultatSabiranja += i; 
			}else if (i % 2 != 0) {
				rezultatMnozenja *= i; 
			}
                i++; 
		}

		System.out.println("Zbir parnih brojeva od 1 do " + brojZaRacunanje + " je " + rezultatSabiranja); 
		System.out.println("Proizvod neparnih brojeva od 1 do " + brojZaRacunanje + " je " + rezultatMnozenja); 

		scan.close(); 
	}

}

