package Modele;

import Modele.Batiment;
import java.util.*;

public class GroupePortes {

	Batiment batiment;
	private ArrayList<GroupePersonne> groupesPersonnes;
	private ArrayList<Porte> portes;

	/**
	 * 
	 * @param code
	 */
	public GroupePortes(Batiment batiment) {
		setBatiment(batiment);
                this.groupesPersonnes = new ArrayList<>();
                this.portes = new ArrayList<>();
	}

        public Batiment getBatiment() {
            return batiment;
        }

        public void setBatiment(Batiment batiment) {
            this.batiment = batiment;
        }

        public ArrayList<GroupePersonne> getGroupesPersonnes() {
            return groupesPersonnes;
        }

        public ArrayList<Porte> getPortes() {
            return portes;
        }
        
        public void setGroupesPersonnes(ArrayList<GroupePersonne> groupesPersonnes) {
            this.groupesPersonnes = groupesPersonnes;
        }

    
        public void setPortes(ArrayList<Porte> portes) {
            this.portes = portes;
        }

        
        public boolean addPorte(Porte p){
            p.setGroupePortes(this);
            return getPortes().add(p);
        }
        
        public boolean addGroupePersonne(GroupePersonne g){
            return getGroupesPersonnes().add(g);
        }

        

}