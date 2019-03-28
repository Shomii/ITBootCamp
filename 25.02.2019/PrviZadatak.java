/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domaci_25_02_2019;

import java.util.Scanner;

/**
 *
 * @author Miroslav Kovacevic
 */
public class PrviZadatak {

    /**
     * Napisati program u kojem korisnik unosi dva realna broja i poziva metodu
     * proizvod i ispisuje u glavnom programu(main) rezultat metode.
     *
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean isNumberAZero = true;
        System.out.println("Ovo je program za racunanje proizvoda dva broja.");

        while (isNumberAZero) {
            double n1, n2;

            System.out.println("\nUnesite prvi broj za racunanje\nili unesite broj 0 za izlaz iz programa ");
            n1 = scan.nextDouble();

            if (n1 != 0) {
                System.out.println("\nUnesite drugi broj za racunanje ");
                n2 = scan.nextDouble();

                double proizvodDvaBroja = proizvod(n1, n2);
                System.out.println("----------------------------------------------");
                System.out.println("Proizvod broja " + n1 + " i " + n2 + " jednak je " + proizvodDvaBroja + "");
                System.out.println("----------------------------------------------\n");
            } else {
                isNumberAZero = false;
                System.out.println("Kraj programa");
            }
        }
    }

    public static double proizvod(double n1, double n2) {

        double proizvodDvaBroja = n1 * n2;
        return proizvodDvaBroja;
    }
}
