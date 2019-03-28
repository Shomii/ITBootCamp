package automobili;

/**
 * Napisati klasu Auto koja sadrzi sledeca polja: Kubikaza Konjaza Broj vrata
 * Proizvodjac Model Cena Napisat gettere i settere za sva polja klase
 * Auto.Takodje napisati 5 razicitih konstruktora i ukoliko nema dovoljno
 * parametara upisati podrazumevane vrednosti. U glavnom programu kreirati tri
 * razlicita auto. Ispisati na izlazu informacije o svakom autu i nakon toga
 * izmeniti neke od vrednosti automobila i ispisati na izlaz nove podatke.
 *
 *
 */
public class Auto {

    private int kubikaza;
    private int konjaza;
    private int brojVrata;
    private int cena;
    private String proizvodjac;
    private String model;

    public Auto(int kubikaza, int konjaza, int brojVrata, int cena, String proizvodjac, String model) {
        this.kubikaza = kubikaza;
        this.konjaza = konjaza;
        this.brojVrata = brojVrata;
        this.cena = cena;
        this.proizvodjac = proizvodjac;
        this.model = model;
    }

    public Auto(int kubikaza, int konjaza, int brojVrata, int cena, String model) {
        this.kubikaza = kubikaza;
        this.konjaza = konjaza;
        this.brojVrata = brojVrata;
        this.cena = cena;
        this.proizvodjac = "Fiat";
        this.model = model;
    }

    public Auto(int kubikaza, int konjaza, int brojVrata, int cena) {
        this.kubikaza = kubikaza;
        this.konjaza = konjaza;
        this.brojVrata = brojVrata;
        this.cena = cena;
        this.proizvodjac = "Fiat";
        this.model = "Punto";
    }

    public Auto(int kubikaza, int konjaza, int cena) {
        this.kubikaza = kubikaza;
        this.konjaza = konjaza;
        this.brojVrata = 5;
        this.cena = cena;
        this.proizvodjac = "Fiat";
        this.model = "Punto";
    }

    public Auto(int konjaza, int cena) {
        this.kubikaza = 1200;
        this.konjaza = konjaza;
        this.brojVrata = 5;
        this.cena = cena;
        this.proizvodjac = "Fiat";
        this.model = "Punto";
    }

    // metoda stampa sve karakteristike auta
    public void getAuto() {
        System.out.println("Trazeni auto je " + getProizvodjac() + " model: " + getModel() + " sa zapreminom motora " + getKubikaza() + " i snagom "
                + getKonjaza() + " konja.\nTrazeni model ima " + getBrojVrata() + " vrata. Cena ovog modela je: " + getCena() + " evra\n");

    }

    // ako je auto na popustu bice objavljeno da je auto na akciji   
    public void isCarsOnDiscount(Auto a, int newPrice) {
        if (a.getCena() > newPrice) {
            a.setCena(newPrice);
            String headingInRedLetters = "\033[31mTRAZENI AUTO JE TRENUTNO NA POPUSTU!!!\033[31m";
            System.out.println(headingInRedLetters + "\nTrazeni auto je " + getProizvodjac() + " model: " + getModel() + " sa zapreminom motora " + getKubikaza() + " i snagom "
                    + getKonjaza() + " konja.\nTrazeni model ima " + getBrojVrata() + " vrata." + "Cena na popustu ovog modela je: " + getCena() + " evra.\n");
        } else {
            a.setCena(newPrice);
            System.out.println("Trazeni auto je " + getProizvodjac() + " model: " + getModel() + " sa zapreminom motora " + getKubikaza() + " i snagom "
                    + getKonjaza() + " konja.\nTrazeni model ima " + getBrojVrata() + " vrata. Cena ovog modela je: " + getCena() + " evra\n");
        }
    }

    // metoda vraca novopostavljeni broj vrata
    public int getNumberOfDoors(int newNumberOfDoors) {
        int doors;
        setBrojVrata(newNumberOfDoors);
        doors = getBrojVrata();

        return doors;
    }

    /**
     * @return the kubikaza
     */
    public int getKubikaza() {
        return kubikaza;
    }

    /**
     * @param kubikaza the kubikaza to set
     */
    public void setKubikaza(int kubikaza) {
        this.kubikaza = kubikaza;
    }

    /**
     * @return the konjaza
     */
    public int getKonjaza() {
        return konjaza;
    }

    /**
     * @param konjaza the konjaza to set
     */
    public void setKonjaza(int konjaza) {
        this.konjaza = konjaza;
    }

    /**
     * @return the brojVrata
     */
    public int getBrojVrata() {
        return brojVrata;
    }

    /**
     * @param brojVrata the brojVrata to set
     */
    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    /**
     * @return the cena
     */
    public int getCena() {
        return cena;
    }

    /**
     * @param cena the cena to set
     */
    public void setCena(int cena) {
        this.cena = cena;
    }

    /**
     * @return the proizvodjac
     */
    public String getProizvodjac() {
        return proizvodjac;
    }

    /**
     * @param proizvodjac the proizvodjac to set
     */
    public void setProizvodjac(String proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

}
