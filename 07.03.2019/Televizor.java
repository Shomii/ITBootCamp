package uredjaji;

public class Televizor extends Uredjaj {

	/**
	 * 
	 * Televizor je uredjaj koji pored stanje poseduje i kanal tipa string na kom se
	 * nalazi. Televizoru moze da se postavi kanal i da se dohvati trenutni kanal,
	 * ukoliko je ukljucen. Ispisuje se u formatu “Televizor(ID:STATUS) je na kanalu
	 * KANAL”;
	 *
	 * 
	 */

	private String kanal;

	public Televizor(String kanal) {
		super();
		this.kanal = kanal;
	}

	public String getKanal() {
		String response = "";
		if (isUredjajOn(this.isStatusUredjaja())) {
			return kanal;
		} else {
			response = "Televizor je iskljucen, TV se mora ukljuciti...";
			System.out.println(response);
			return response;
		}
	}

	public String setKanal(String kanal) {
		String response = "";
		if (isUredjajOn(this.isStatusUredjaja())) {
			return this.kanal = kanal;
		} else {
			response = "Televizor je iskljucen, TV se mora ukljuciti...";
			System.out.println(response);
			return response;
		}
	}

	public String toString() {
		if (isUredjajOn(this.isStatusUredjaja())) {
			return "Televizor:(id-" + getId() + ":" + onAndOff(this.isStatusUredjaja()) + ") je na kanalu "
					+ this.getKanal();
		} else {
			return "Televizor:(id-" + getId() + ":" + onAndOff(this.isStatusUredjaja()) + ") je iskljucen";
		}
	}
}
