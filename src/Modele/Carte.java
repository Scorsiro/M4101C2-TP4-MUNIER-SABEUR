package Modele;

public class Carte {

	Employé proprio;
	private int numCarte;
	private String codeCarte;

	/**
	 * 
	 * @param numCarte
	 * @param codeCarte
	 */
	public Carte(int numCarte, String codeCarte) {
		// TODO - implement Carte.Carte
		throw new UnsupportedOperationException();
	}

	public int getNumCarte() {
		return this.numCarte;
	}

	/**
	 * 
	 * @param numCarte
	 */
	public void setNumCarte(int numCarte) {
		this.numCarte = numCarte;
	}

	public String getCodeCarte() {
		return this.codeCarte;
	}

	/**
	 * 
	 * @param codeCarte
	 */
	public void setCodeCarte(String codeCarte) {
		this.codeCarte = codeCarte;
	}

}