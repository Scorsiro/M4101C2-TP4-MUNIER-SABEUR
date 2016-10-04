package Controleur;

import Vue.IHMgardien;
import Vue.IHMlecteur;
import Vue.IHMappli;
import Vue.Observateur;
import Modele.Porte;
import Modele.Employé;
import java.util.*;

public class Controleur extends Observable {

	IHMappli ihmAppli;
	IHMgardien ihmGardien;
	ArrayList<IHMlecteur> ihmLecteurs;
	//Collection<Observateur> observateurs;
	ArrayList<Porte> portes;

	/**
	 * 
	 * @param e
	 * @param p
	 */
	public void ouvrirPorte(Employé e, Porte p) {
		// TODO - implement Controleur.ouvrirPorte
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 * @param numCarte
	 * @param codeCarte
	 */
	public void lireCarte(int id, int numCarte, String codeCarte) {
		// TODO - implement Controleur.lireCarte
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param numC
	 * @param codeC
	 */
	public void addIhmLecteur(int numC, String codeC) {
		// TODO - implement Controleur.addIhmLecteur
		throw new UnsupportedOperationException();
	}

}