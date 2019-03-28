package prinosPoParceli;

public class Njiva extends Parcela {

	/**
	 * Njiva je parcela koja ima zadat godisnji prinos po kvadratnom metru. Prinos
	 * po kvadratnom metru moze da se promeni. Oznaka vrste je N. Prinos njive se
	 * racuna po formuli: povrsina*prinosPoKvM. Tekstualni oblik je
	 * Parcela:PrinosPoKvM.
	 */

	private double prinosPoKvM;
	private double prinos;

	public Njiva(double povrsina, char jednoslovnaVrsta, double prinosPoKvM) {
		super(povrsina, jednoslovnaVrsta);
		this.prinosPoKvM = prinosPoKvM;
		this.prinos = 0;
	}

	public double getPrinosPoKvM() {
		return prinosPoKvM;
	}

	public void setPrinosPoKvM(double prinosPoKvM) {
		this.prinosPoKvM = prinosPoKvM;
	}

	public double getPrinos() {
		return prinos;
	}

	public void setPrinos(double prinos) {
		this.prinos = prinos;
	}

	@Override
	public void izracunajPrinos() {
		setPrinos(getPovrsina() * getPrinosPoKvM());

	}

	public int izracunajPrinosZaGodine(int godine) {
		int god = (int) (getPovrsina() * getPrinosPoKvM()) * godine;
		return god;
	}

	public String toString() {
		String parcela = super.toString();
		return parcela + ", sa prinosom " + String.format("%.2f", this.getPrinos());
	}
}
