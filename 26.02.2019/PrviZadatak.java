package domaci_26_02_2019;

import java.util.Scanner;

/**
 * Napisati program koji ucitava ceo broj N. Taj broj N se prosledjuje metodi
 * koja formira i vraća ceo broj koji predstavlja inverzan broj. Glavni program
 * nakon toga ispisuje taj inverzan broj. Primer: 121 - > 121 452 - > 254 326 -
 * > 623
 */
public class PrviZadatak {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println(" ");
        System.out.println("Unesite broj: ");
        n = scan.nextInt();
        int inverzanBroj = iverzanBroj(n);
        System.out.println("Inverzni broj od broja " + n + " je " + inverzanBroj);
        
        scan.close();
    }

    public static int iverzanBroj(int n) {

        int inverzanBroj = 0;

            while(n>0){
                
            inverzanBroj = inverzanBroj * 10 + (n % 10);
            System.out.println("inverzanBroj: " + inverzanBroj);
            n /= 10;
        }
        return inverzanBroj;
    }

}
