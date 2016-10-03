package Modele;

import Modele.Carte;
import java.util.*;

public class Employé {

	Collection<GroupePersonne> groupesPersonnes;
	Carte carte;
	private String nom;
	private String prenom;

	/**
	 * 
	 * @param nom
	 * @param prenom
	 * @param carte
	 */
	public Employé(String nom, String prenom, Carte carte) {
		// TODO - implement Employé.Employé
		throw new UnsupportedOperationException();
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

	public String getPrenom() {
		return this.prenom;
	}

	/**
	 * 
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Carte getCarte() {
		return this.carte;
	}

}