package drum;

/**
 *
 * Vozac ima ime i prezime koje se zadaje prilikom kreiranja vozaca. Vozac
 * poseduje i broj vozacke dozvole koji se moze dohvatiti i postaviti. Ime
 * vozaca se moze dohvatiti ali ne i postaviti. Vozac se ispisuje u obliku:
 * IME_PREZIME{BROJ_VOZACKE}.
 *
 */
public class Vozac {

    // parametri klase Vozac
    private String ime_prezime;
    private long brojVozackeDozvole;

    // podrazumevani konstruktor klase Vozac
    public Vozac() {
        this.ime_prezime = "Nema podataka";
        this.brojVozackeDozvole = 0;
    }

    // konstruktor klase Vozac sa zadatim parametrom ime_prezime
    public Vozac(String ime_prezime) {
        this.ime_prezime = ime_prezime;
        this.brojVozackeDozvole = 0;
    }

    // get i set metode
    public String getIme_prezime() {
        return ime_prezime;
    }

    public long getBrojVozackeDozvole() {
        return brojVozackeDozvole;
    }

    public void setBrojVozackeDozvole(long brojVozackeDozvole) {
        this.brojVozackeDozvole = brojVozackeDozvole;
    }

// toString metoda za ispis parametara klase Vozac
    @Override
    public String toString() {
        return "Ime i prezime vozaca: " + this.getIme_prezime() + " (sa brojem dozvole: " + this.getBrojVozackeDozvole() + ")";
    }
}
