package prevoznaSredstva;

public class Auto extends Vozilo {

	// automobil je vozilo koje sadrzi odredjen broj putnika,
	// registarski broj STRING, poseduje snagu DOUBLE,


	private String registarskaOznaka;
	private double snaga;

	public Auto(int brMesta, int brojPutnika, String registarskaOznaka, double snaga) {
		super(brMesta);
		this.registarskaOznaka = registarskaOznaka;
		this.snaga = snaga;
	}

	public String getRegistarskaOznaka() {
		return registarskaOznaka;
	}

	public void setRegistarskaOznaka(String registarskaOznaka) {
		this.registarskaOznaka = registarskaOznaka;
	}

	public double getSnaga() {
		return snaga;
	}

	public void setSnaga(double snaga) {
		this.snaga = snaga;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Auto(" + getId() + ":" + this.getRegistarskaOznaka() + "<" + getGorivo() + ">:");
		sb.append(getBrojPutnika() + "{");

		for (int i = 0; i < getBrojMestaZaPrevoz().length; i++) {
			if (getBrojMestaZaPrevoz()[i] != null)
				sb.append(getBrojMestaZaPrevoz()[i] + ",");
		}
		sb.append("}");
		return sb.toString();

	}

}
