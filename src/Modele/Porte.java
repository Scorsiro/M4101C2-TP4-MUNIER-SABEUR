package Modele;

public class Porte {

	GroupePortes groupePortes;
	private int id;
	private boolean etatVoyantVert;

	/**
	 * 
	 * @param id
	 */
	public Porte(int id) {
		// TODO - implement Porte.Porte
		throw new UnsupportedOperationException();
	}

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public boolean getEtatVoyantVert() {
		return this.etatVoyantVert;
	}

	/**
	 * 
	 * @param etatVoyantVert
	 */
	public void setEtatVoyantVert(boolean etatVoyantVert) {
		this.etatVoyantVert = etatVoyantVert;
	}

}