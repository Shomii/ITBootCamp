package automobili;

/**
 * Test klasa za klasu Auto
 */
public class TestAuto {

    public static void main(String[] args) {

        // kreiranje objekta klase auto
        Auto autoBr1 = new Auto(1300, 86, 5, 12300, "Fiat", "Tipo");
        Auto autoBr2 = new Auto(1600, 110, 4, 15000, "Tipo");
        Auto autoBr3 = new Auto(1350, 75, 5, 10000);
        Auto autoBr4 = new Auto(1250, 68, 9750);
        Auto autoBr5 = new Auto(68, 8900);

        // ispis karakteristika objekata klase auto
        autoBr1.getAuto();
        autoBr2.getAuto();
        autoBr3.getAuto();
        autoBr4.getAuto();
        autoBr5.getAuto();
        System.out.println("-------------------------------------------------\n");

        // ako se unese druga cena odredjenog auto, metoda proverava da li je na popustu
        autoBr1.isCarsOnDiscount(autoBr1, 11900);

        // metodom iz klase Auto menja se broj vrata i ispisuju trenutne karakteristike auta
        autoBr2.getNumberOfDoors(5);
        autoBr2.isCarsOnDiscount(autoBr2, 15000);

        // kreiranje novog objekta klase Auto gde podatak za broj vrata  
        // dobija preko metode iz klase Auto koja vraca broj vrata
        Auto autoBr6 = new Auto(2000, 160, autoBr3.getNumberOfDoors(4), 20000);
        autoBr6.isCarsOnDiscount(autoBr6, 21900);
    }
}
