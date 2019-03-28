package drum;

/**
 *Automobil ima serijski broj koji se zadaje pri kreiranju automobila. 
 * Serijski broj se moze samo dohvatiti. Takodje poseduje snagu koja se moze 
 * dohvatiti i postaviti. Auto poseduje vozaca i stvara se bez njega(u konstruktoru 
 * treba da se vozac postavi na null); Vozac se naknadno postavlja koristeci setter. 
 * Vozac se moze postaviti i dohvatiti. Automobil se ispsuje u sledecem 
 * formatu: SERIJSKI_BROJ{SNAGA}VOZAC
 * 
 */
public class Automobil {
    
    // parametri klase Automobil
    private long serijskiBroj;
    private int snaga;
    private Vozac vozac;
    
    // podrazumevani konstruktor klase Automobil
    public Automobil(){
        this.serijskiBroj = 0;
        this.snaga = 0;
        this.vozac = null;
    }
    
    // konstruktor klase Automobil sa zadatim parametrom serijskiBroj
    public Automobil(long serijskiBroj){
        this.serijskiBroj = serijskiBroj;
        this.snaga = 0;
        this.vozac = null;
    }

    // get i set metode
    public long getSerijskiBroj() {
        return serijskiBroj;
    }

    public int getSnaga() {
        return snaga;
    }

    public void setSnaga(int snaga) {
        this.snaga = snaga;
    }

    public Vozac getVozac() {
        return vozac;
    }

    public void setVozac(Vozac vozac) {
        this.vozac = vozac;
    }
    
    // toString metoda za ispis parametara klase Automobil
    @Override
    public String toString(){
       return "Serijski broj automobila: " + this.getSerijskiBroj() + " (snage: " + this.getSnaga() + ") i " + this.getVozac(); 
    }
    
}
