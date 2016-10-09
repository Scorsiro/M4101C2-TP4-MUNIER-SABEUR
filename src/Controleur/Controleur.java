package Controleur;

import Modele.Carte;
import Vue.IHMgardien;
import Vue.IHMlecteur;
import Vue.IHMappli;
import Vue.Observateur;
import Modele.Porte;
import Modele.Employé;
import Modele.GroupePersonne;
import java.util.*;

public class Controleur extends Observable {

	IHMappli ihmAppli;
	IHMgardien ihmGardien;
	ArrayList<IHMlecteur> ihmLecteurs;
	//Collection<Observateur> observateurs;
	public HashMap<Integer,Porte> portes = new HashMap<>();
        public HashMap<Integer,Carte> cartes = new HashMap<>();

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
		Porte porte = portes.get(id);
                Carte carte = cartes.get(numCarte);
                HashMap<String,Object> objetsObserves = new HashMap<>();
                objetsObserves.put("porte",porte);
                objetsObserves.put("carte",carte);
                ArrayList<GroupePersonne> groupePersonnes = porte.getGroupePortes().getGroupesPersonnes();
                int i=0;
                while(i<groupePersonnes.size() && !codeCarte.contains(groupePersonnes.get(i).getCode())){
                    System.out.println(groupePersonnes.get(i).getCode());
                    i++;
                }
                boolean valide = (i<groupePersonnes.size());
                porte.setEtatVoyantVert(valide);
                this.setChanged();
                this.notifyObservers(objetsObserves);
	}
        
        //methode pour recuperer les infos necessaires à afficher, todo
        public void infoPorteGardien(){
            
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