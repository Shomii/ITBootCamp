package prevoznaSredstva;

public class Putnik {

	// putnik ima ime i prezime STRING,
	// i jedinstveni id koji se automatski dodeduljuje

	public static int jedinstveniBrojPutnika;

	private String imeIPrezime;
	private int id;

	public Putnik() {
		this.imeIPrezime = "";
		this.id = ++jedinstveniBrojPutnika;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public int getId() {
		return id;
	}

	public String toString() {

		return "Putnik[" + this.getId() + ":" + this.getImeIPrezime() + "]";
	}

}
