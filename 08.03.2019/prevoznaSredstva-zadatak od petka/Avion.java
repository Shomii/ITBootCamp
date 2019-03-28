package prevoznaSredstva;

public class Avion extends Vozilo {

	// avion je vozilo koje sadrzi putnike
	// i koje ima jedinstveni serijski broj String, marku STRING,
	// kao i klasu putnika koju
	// koje prevozi STRING

	private String serijskiBroj;
	private String markaAviona;
	private String klasaPutnika;

	public Avion(int brMesta, String serijskiBroj, String markaAviona) {
		super(brMesta);
		this.serijskiBroj = serijskiBroj;
		this.markaAviona = markaAviona;
	}

	public String getSerijskiBroj() {
		return serijskiBroj;
	}

	public void setSerijskiBroj(String serijskiBroj) {
		this.serijskiBroj = serijskiBroj;
	}

	public String getMarkaAviona() {
		return markaAviona;
	}

	public void setMarkaAviona(String markaAviona) {
		this.markaAviona = markaAviona;
	}
	
	public String getKlasaPutnika() {
		return klasaPutnika;
	}

	public void setKlasaPutnika(String klasaPutnika) {
		this.klasaPutnika = klasaPutnika;
	}

	@Override
	public boolean postaviPutnika(Putnik p, int i) {
		if (i >= getBrojMestaZaPrevoz().length || i < 0) {
			System.out.println("Nesto nije u redu, nema tog mesta u vozilu");
			return false;
		}
		if (getBrojMestaZaPrevoz()[i] != null) {
			System.out.println("Nesto nije u redu, izgleda da je mesto zauzeto");
			return false;
		}
		for (int j = 0; j < getBrojMestaZaPrevoz().length; j++) {
			if (getBrojMestaZaPrevoz()[j] != null) {
				if (getBrojMestaZaPrevoz()[j] == p) {
					System.out.println("Nesto nije u redu, probajte ponovo da postavite putnika");
					return false;
				}
			}
		}
		getBrojMestaZaPrevoz()[i] = p;
		setBrojPutnika(getBrojPutnika() + 1);
		if (i >= 1 && i < 25) {
			this.setKlasaPutnika("I klasa");

		} else if (i > 26 && i < 75) {
			this.setKlasaPutnika("business klasa");
		} else {
			this.setKlasaPutnika("economic klasa");
		}
		System.out.println("Putnik " + p.getImeIPrezime() + " je postavljen na mesto " + i);
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Avion(" + getId() + ":" + this.getSerijskiBroj() + ":<" + getGorivo() + ">:");
		sb.append(getBrojPutnika() + "{");

		for (int i = 0; i < getBrojMestaZaPrevoz().length; i++) {
			if (getBrojMestaZaPrevoz()[i] != null)
				sb.append(getBrojMestaZaPrevoz()[i] + ",");
		}
		sb.append("}");
		return sb.toString();

	}

}
