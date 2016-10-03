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
	public Employé(String nom, String prenom) {
		setNom(nom);
                setPrenom(prenom);
                setCarte(null);
                setGroupesPersonnes(null);
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

        public Collection<GroupePersonne> getGroupesPersonnes() {
            return groupesPersonnes;
        }

        public void setGroupesPersonnes(Collection<GroupePersonne> groupesPersonnes) {
            this.groupesPersonnes = groupesPersonnes;
        }
        
        public boolean addGroupePersonne(GroupePersonne g){
            g.addEmploye(this);
            return getGroupesPersonnes().add(g);
        }
  

}