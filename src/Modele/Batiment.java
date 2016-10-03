package Modele;

public class Batiment {

	private String nom;

	/**
	 * 
	 * @param nom
	 */
	public Batiment(String nom) {
		setNom(nom);
	}

	public String getNom() {
		return this.nom;
	}

	/**
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

}