package prinosPoParceli;

public abstract class Parcela {

	/**
	 * Parcela ima jednoznacan automatski generisan celobrojan identifikator i
	 * zadatu povrsinu(u kvadratnim metrima) prilikom kreiranja. Mogu da joj se
	 * dohvate sadrzani podaci, kao i jednoslovna vrsta. Moze da joj se odredi
	 * prinos u periodu zadatom brojem godina. Moze da se sastavi tekstualni opis u
	 * obliku VRSTA-ID[POVRSINA].
	 */

	public static int jedinstveniBroj;

	private double povrsina;
	private char jednoslovnaVrsta;
	private int id;

	public Parcela(double povrsina, char jednoslovnaVrsta) {
		this.povrsina = povrsina;
		this.jednoslovnaVrsta = jednoslovnaVrsta;
		this.id = ++jedinstveniBroj;
	}

	public double getPovrsina() {
		return povrsina;
	}

	public char getJednoslovnaVrsta() {
		return jednoslovnaVrsta;
	}

	public int getId() {
		return id;
	}

	public abstract void izracunajPrinos();

	public String toString() {

		return "Parcela:" + this.getJednoslovnaVrsta() + "-" + this.getId() + "[povrsina:"
				+ String.format("%.2f", this.getPovrsina()) + "]";
	}

}
