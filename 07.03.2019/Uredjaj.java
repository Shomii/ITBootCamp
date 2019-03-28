package uredjaji;

public class Uredjaj {

	/**
	 * 
	 * Uredjaj ima stanje da li je ukljucen ili iskljucen. Njegovo stanje moze da se
	 * postavi i da se dohvati. Takodje poseduje i jedinstveni identifikator koji se
	 * zadaje prilikom kreiranja uredjaja i moze da se dohvati. Ispisuje se u
	 * formatu “Uredjaj(ID:STATUS)” STATUS treba da ima vrednosti ON i OFF;
	 *
	 * 
	 */
	public static int univerzalniId;

	private boolean statusUredjaja;
	private int id;

	public Uredjaj() {
		this.statusUredjaja = false;
		this.id = ++univerzalniId;
	}

	public boolean isStatusUredjaja() {
		return statusUredjaja;
	}

	public void setStatusUredjaja(boolean statusUredjaja) {
		this.statusUredjaja = statusUredjaja;
	}

	public boolean isUredjajOn(boolean status) {
		if (isStatusUredjaja()) {
			return true;
		} else {
			return false;
		}
	}

	public String onAndOff(boolean statusUredjaja) {
		String onOrOff = "";
		if (isStatusUredjaja()) {
			onOrOff = "ON";
		} else {
			onOrOff = "OFF";
		}
		return onOrOff;
	}

	public int getId() {
		return id;
	}

	public String toString() {

		return "Uredjaj:(id-" + getId() + ": " + onAndOff(this.isStatusUredjaja()) + ")";
	}

}
