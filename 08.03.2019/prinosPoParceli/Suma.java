package prinosPoParceli;

public class Suma extends Parcela {

	/**
	 * Suma je parcela koja ima zadate povrsinu koju zauzimaju stabla, prinos po
	 * zrelom stablu i period sazrevanja od zasada do sece izrazen u celom broju
	 * godina. Oznaka vrste je S. Prinos se ostvaruje formulom
	 * povrsina_parcele/povrsina_stabla*prinos_stabla*(godine/sazrevanje).
	 * Tekstualni oblik je *Parcela:(povrsstabla,prinosSt,Period). Ovo se ostvaruje
	 * pozivom super.toString();
	 */

	private double povrsinaPodStablima;
	private double prinosPoZrelomStablu;
	private int sazrevanjeStabala;
	private double godine;
	private double prinos;
	private double period;

	public Suma(double povrsina, char jednoslovnaVrsta, double povrsinaPodStablima, double prinosPoZrelomStablu,
			int sazrevanjeStabala, double godine) {
		super(povrsina, jednoslovnaVrsta);
		this.povrsinaPodStablima = povrsinaPodStablima;
		this.prinosPoZrelomStablu = prinosPoZrelomStablu;
		this.sazrevanjeStabala = sazrevanjeStabala;
		this.godine = godine;
		this.prinos = 0;
	}

	public double getPrinos() {
		return prinos;
	}

	public void setPrinos(double prinos) {
		this.prinos = prinos;
	}

	public double getPovrsinaPodStablima() {
		return povrsinaPodStablima;
	}

	public void setPovrsinaPodStablima(double povrsinaPodStablima) {
		this.povrsinaPodStablima = povrsinaPodStablima;
	}

	public double getPrinosPoZrelomStablu() {
		return prinosPoZrelomStablu;
	}

	public void setPrinosPoZrelomStablu(double prinosPoZrelomStablu) {
		this.prinosPoZrelomStablu = prinosPoZrelomStablu;
	}

	public int getSazrevanjeStabala() {
		return sazrevanjeStabala;
	}

	public void setSazrevanjeStabala(int sazrevanjeStabala) {
		this.sazrevanjeStabala = sazrevanjeStabala;
	}

	public double getGodine() {
		return godine;
	}

	public void setGodine(double godine) {
		this.godine = godine;
	}

	@Override
	public void izracunajPrinos() {
		period = getGodine() / getSazrevanjeStabala();
		setPrinos(getPovrsina() / getPovrsinaPodStablima() * getPrinosPoZrelomStablu() * (double) period);
	}

	public String toString() {
		String parcela = super.toString();
		return parcela + ", pod stablima " + String.format("%.2f", this.getPovrsinaPodStablima()) + ", prinos "
				+ String.format("%.2f", this.getPrinos()) + ", za period od " + String.format("%.0f", this.getGodine())
				+ " godine";
	}
}
