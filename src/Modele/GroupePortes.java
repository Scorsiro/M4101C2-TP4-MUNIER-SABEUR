package Modele;

import Modele.Batiment;
import java.util.*;

public class GroupePortes {

	Batiment batiment;
	private Collection<GroupePersonne> groupesPersonnes;
	private Collection<Porte> portes;

	/**
	 * 
	 * @param code
	 */
	public GroupePortes(Batiment batiment) {
		setBatiment(batiment);
                setGroupesPersonnes(null);
                setPortes(null);
	}

        public Batiment getBatiment() {
            return batiment;
        }

        public void setBatiment(Batiment batiment) {
            this.batiment = batiment;
        }

        public Collection<GroupePersonne> getGroupesPersonnes() {
            return groupesPersonnes;
        }

        public Collection<Porte> getPortes() {
            return portes;
        }
        
        public void setGroupesPersonnes(Collection<GroupePersonne> groupesPersonnes) {
            this.groupesPersonnes = groupesPersonnes;
        }

    
        public void setPortes(Collection<Porte> portes) {
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