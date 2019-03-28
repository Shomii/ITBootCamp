package uredjaji;

public class LapTop extends Uredjaj {

	/**
	 * 
	 * Laptop je uredjaj koji poseduje RAM memoriju izrazenu u GB, Model procesora
	 * (String). Ispisuje se u formatu “Laptop(ID:STATUS)[RAM GB,Model Procesor]”
	 * STATUS treba da ima vrednosti ON i OFF;
	 */

	private int ramMemorija;
	private String modelProcesora;

	public LapTop(String procesor, int memorija) {
		super();
		this.modelProcesora = procesor;
		this.ramMemorija = memorija;
	}

	public int getRamMemorija() {
		return ramMemorija;
	}

	public void setRamMemorija(int ramMemorija) {
		this.ramMemorija = ramMemorija;
	}

	public String getModelProcesora() {
		return modelProcesora;
	}

	public void setModelProcesora(String modelProcesora) {
		this.modelProcesora = modelProcesora;
	}

	public String toString() {
		if (isUredjajOn(isStatusUredjaja())) {
			return "LapTop:(id-" + this.getId() + ":" + onAndOff(this.isStatusUredjaja()) + ")[RAM "
					+ this.getRamMemorija() + " GB, model procesora " + this.getModelProcesora() + "]";
		} else {
			return "LapTop:(id-" + this.getId() + ":" + onAndOff(this.isStatusUredjaja()) + ") je iskljucen";
		}
	}
}
