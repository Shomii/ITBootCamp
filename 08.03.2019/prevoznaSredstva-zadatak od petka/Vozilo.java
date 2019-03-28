package prevoznaSredstva;

import klaseV2.Pacijent;

public class Vozilo {

//	- kreirati paket prevozno sredstvo
//	- kreirati klasu vozilo koje poseduje broj mesta za prevoz putnika, gorivo
//	- kapacitet prevoza putnika zadaje se prilikom kreiranja vozila i nemoguce ga je promeniti

	public static int jedinstveniBrojVozila;

	private Putnik[] brojMestaZaPrevoz;
	private int brojPutnika;
	private double gorivo;
	private int id;

	public Vozilo(int brMesta) {
		this.brojMestaZaPrevoz = new Putnik[brMesta];
		this.gorivo = 0;
		this.brojPutnika = 0;
		this.id = ++jedinstveniBrojVozila;
	}

	public int getBrojPutnika() {
		return brojPutnika;
	}

	public double getGorivo() {
		return gorivo;
	}

	public void setGorivo(double gorivo) {
		this.gorivo = gorivo;
	}

	public Putnik[] getBrojMestaZaPrevoz() {
		return brojMestaZaPrevoz;
	}

	public int getIntBrojMestaZaPrevoz() {
		return this.brojMestaZaPrevoz.length;
	}

	public int getId() {
		return id;
	}

	public boolean postaviPutnika(Putnik p, int i) {
		if (i >= this.brojMestaZaPrevoz.length || i < 0) {
			System.out.println("Nesto nije u redu, nema tog mesta u vozilu");
			return false;
		}
		if (this.brojMestaZaPrevoz[i] != null) {
			System.out.println("Nesto nije u redu, izgleda da je mesto zauzeto");
			return false;
		}
		for (int j = 0; j < this.brojMestaZaPrevoz.length; j++) {
			if (this.brojMestaZaPrevoz[j] != null) {
				if (this.brojMestaZaPrevoz[j] == p) {
					System.out.println("Nesto nije u redu, probajte ponovo da postavite putnika");
					return false;
				}
			}
		}
		this.brojMestaZaPrevoz[i] = p;
		this.brojPutnika++;
		System.out.println("Putnik " + p.getImeIPrezime() + " je postavljen na mesto " + i);
		return true;
	}

	public void ukloniPutnika(Putnik p, int i) {
		if (i >= this.brojMestaZaPrevoz.length || i < 0)
			return;
		if (brojMestaZaPrevoz[i] == null)
			return;
		brojMestaZaPrevoz[i] = null;
		System.out.println("Putnik " + p.getImeIPrezime() + " je uklonjen sa mesta " + i);
	}

	public void setBrojPutnika(int brojPutnika) {
		this.brojPutnika = brojPutnika;
	}

	public void dodajGorivo(double gorivo) {
		if (gorivo > 0) {
			this.gorivo += gorivo;
		} else {
			System.out.println("ne mozete dodati negatinu vrednost");
		}
	}

	public void istociGorivo(double gorivo) {
		if (this.gorivo - gorivo > 0) {
			this.gorivo -= gorivo;
		} else {
			System.out.println("nemate dovoljno goriva");
		}
	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("Vozilo:(" + this.getId() + "<" + this.getGorivo() + ">:" + getBrojPutnika() + "{");

		for (int i = 0; i < getBrojMestaZaPrevoz().length; i++) {
			if (getBrojMestaZaPrevoz()[i] != null)
				sb.append(getBrojMestaZaPrevoz()[i] + ",");
		}
		sb.append("}");
		return sb.toString();

	}
}
