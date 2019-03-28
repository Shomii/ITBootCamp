package drum;


public class TestDrum {
    public static void main(String[] args) {
        
    // kreiranje objekta klase Vozac sa dodeljivanjem imena vozaca    
    Vozac v1 = new Vozac("Pera Peric");
    // kreiranje objekta klase Vozac preko podrazumevanog konstruktora
    Vozac v2 = new Vozac();
    
    // dodela vrednosti preko set metode za brojVozackeDozvole
    v1.setBrojVozackeDozvole(254856544);
    v2.setBrojVozackeDozvole(658945852);
    
    // ispis u konzoli preko toString() metode u klasi Vozac
    System.out.println(v1);
    System.out.println(v2+"\n");

    // kreiranje objekta klase Automobil
    Automobil a1 = new Automobil(695845154);
    Automobil a2 = new Automobil(1234567890);
    
    // dodela vrednosti preko set metode za snagu
    a1.setSnaga(85);
    a2.setSnaga(120);
    
    // dodela vrednosti preko set metode za objekat klase Vozac
    a1.setVozac(v1);
    a2.setVozac(v2);
    
    // ispis u konzoli preko toString() metode u klasi Automobil
    System.out.println(a1);
    System.out.println(a2);
            
    }
}
