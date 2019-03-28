/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vezba1;

import java.util.Scanner;

/**
 Napisati program koji u zavisnoti od unesenog stringa racuna povrsine kvadrata,
 * kruga ili pravougaonika. Ukoliko se unese “pravougaonik” nek pita koristnika 
 * za 2 stranice i ispise povrsinu. Ukoliko se unese “krug” nek pita korisnika za 
 * poluprecnik kruga i izracuna povrsinu. Ukoliko se unese “kvadrat” nek pita 
 * korisnika za unos stranice i izracuna povrsinu kvadrata

 */
public class TreciZadatak {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Unesite neki objekat od ponudjenih ");
        System.out.println("pravougaonik, krug ili kvadrat");
        System.out.println("da bi ste izracunali povrinu objekta ");
        String object;
        object = scan.nextLine().toLowerCase();

        switch (object) {
            case "pravougaonik":
                System.out.println("Unesite vrednost stranice a pravougaonika: ");
                int a = 0;
                a = scan.nextInt();
                if (a < 0) {
                    System.out.println("Uneli ste negativnu vrednost...\n Pokrenite program ponovo");
                    break;
                }
                System.out.println("Unesite vrednost stranice b pravougaonika: ");
                int b = 0;
                b = scan.nextInt();
                if (b < 0) {
                    System.out.println("Uneli ste negativnu vrednost...\n Pokrenite program ponovo");
                    break;
                }
                System.out.println("Povrsina pravougaonika je " + (a * b));
                break;
            case "krug":
                System.out.println("Unesite vrednost poluprecnika kruga r: ");
                int r = 0;
                r = scan.nextInt();
                if (r < 0) {
                    System.out.println("Uneli ste negativnu vrednost...\n Pokrenite program ponovo");
                    break;
                }
                System.out.println("Povrsina pravougaonika je " + (3.14 * r * r));
                break;
            case "kvadrat":
                System.out.println("Unesite vrednost poluprecnika kruga r: ");
                int aa = 0;
                aa = scan.nextInt();
                if (aa < 0) {
                    System.out.println("Uneli ste negativnu vrednost...\n Pokrenite program ponovo");
                    break;
                }
                System.out.println("Povrsina pravougaonika je " + (aa * aa));
                break;
            default:
                System.out.println("Nekorektan unos");
                break;
        }
        scan.close();
        
        // Još jedan način da se uradi zadatak
/*
        importjava.util.Scanner;



    public class TreciZadatak {

        static Scanner sc = new Scanner(System.in);
        static String object;
        static int r;

        public static void main(String[] args) {

            System.out.println("Unesite neki objekat od ponudjenih ");
            System.out.println("pravougaonik, krug ili kvadrat");
            System.out.println("da bi ste izracunali povrinu objekta ");

            boolean inputs = true;
            while (inputs) {

                chooseObject();

                if ("pravougaonik".equals(object)) {
                    System.out.println("Unesite vrednost stranice a pravougaonika: ");
                    int a;
                    a = sc.nextInt();
                    while (a <= 0) {
                        System.out.println("Uneli ste negativnu vrednost...\n");
                        System.out.println("Unesite vrednost stranice a pravougaonika: ");
                        a = sc.nextInt();
                    }
                    System.out.println("Unesite vrednost stranice b pravougaonika: ");
                    int b;
                    b = sc.nextInt();
                    while (b <= 0) {
                        System.out.println("Uneli ste negativnu vrednost...\n");
                        System.out.println("Unesite vrednost stranice b pravougaonika: ");
                        b = sc.nextInt();
                    }
                    System.out.println("Povrsina pravougaonika za stranicu a=" + a + " i stranicu b=" + b + " je " + (a * b) + "\n");

                } else if ("krug".equals(object)) {

                    circle();

                    while (r <= 0) {
                        circleCheck();
                    }
                    circleCalculate();

                } else if ("kvadrat".equals(object)) {
                    System.out.println("Unesite vrednost stranice a: ");
                    int aa;
                    aa = sc.nextInt();
                    while (aa <= 0) {
                        System.out.println("Uneli ste negativnu vrednost...\n");
                        System.out.println("Unesite vrednost stranice a: ");
                        aa = sc.nextInt();
                    }
                    System.out.println("Povrsina kvadrata za stranicu a=" + aa + " je " + (aa * aa) + "\n");
                } else if ("kraj".equals(object)) {
                    inputs = false;
                    System.out.println("Kraj programa !");
                }
            }
        scan.close();
        }

        private static void circle() {
            System.out.println("Unesite vrednost poluprecnika kruga r: ");
            r = sc.nextInt();
        }

        private static void circleCheck() {
            System.out.println("Uneli ste negativnu vrednost...\n Pokrenite program ponovo");
            circle();
        }

        private static void circleCalculate() {
            System.out.println("Povrsina kruga za poluprecnik r=" + r + " je " + (3.14 * r * r) + "\n");

        }

        private static void chooseObject() {
            System.out.println("Unesite objekat: ");
            object = sc.nextLine().toLowerCase();
        }
    }*/
//---- kraj primera kako može da se uradi zadatak

}
}
