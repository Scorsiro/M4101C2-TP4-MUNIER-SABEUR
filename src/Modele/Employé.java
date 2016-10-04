package Modele;

import Modele.Carte;
import java.util.*;

public class Employé {

	ArrayList<GroupePersonne> groupesPersonnes;
	Carte carte;
	private String nom;
	private String prenom;

	/**
	 * 
	 * @param nom
	 * @param prenom
	 * @param carte
	 */
	public Employé(String nom, String prenom) {
		setNom(nom);
                setPrenom(prenom);
                setCarte(null);
                this.groupesPersonnes = new ArrayList<>();
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

        public void setCarte(Carte carte) {
            this.carte = carte;
        }

        public ArrayList<GroupePersonne> getGroupesPersonnes() {
            return groupesPersonnes;
        }

        public void setGroupesPersonnes(ArrayList<GroupePersonne> groupesPersonnes) {
            this.groupesPersonnes = groupesPersonnes;
        }
        
        public boolean addGroupePersonne(GroupePersonne g){
            //boolean reussi1 = g.addEmploye(this);
            boolean reussi = getGroupesPersonnes().add(g);
            getCarte().setCodeCarte(this);
            return reussi;
        }
  

}