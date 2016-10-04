package Modele;

import java.util.*;

public class GroupePersonne {

	ArrayList<Employé> personnes;
	ArrayList<GroupePortes> groupesPortes;
	private String code;

	/**
	 * 
	 * @param code
	 */
	public GroupePersonne(String code) {
		setCode(code);
                this.groupesPortes = new ArrayList<GroupePortes>();
                this.personnes = new ArrayList<>();
	}

	public String getCode() {
		return this.code;
	}

	/**
	 * 
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}

        public ArrayList<Employé> getPersonnes() {
            return personnes;
        }

        public void setPersonnes(ArrayList<Employé> personnes) {
            this.personnes = personnes;
        }

        public ArrayList<GroupePortes> getGroupesPortes() {
            return groupesPortes;
        }

        public void setGroupesPortes(ArrayList<GroupePortes> groupesPortes) {
            this.groupesPortes = groupesPortes;
        }
        
        
        
        public boolean addEmploye(Employé e){
            e.addGroupePersonne(this);
            return getPersonnes().add(e);
        }
        
        public boolean addGroupePortes(GroupePortes g){
            return getGroupesPortes().add(g) && g.addGroupePersonne(this);
        }

}