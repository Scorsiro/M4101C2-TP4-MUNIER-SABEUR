package Modele;

import java.util.*;

public class GroupePersonne {

	Collection<Employé> personnes;
	Collection<GroupePortes> groupesPortes;
	private String code;

	/**
	 * 
	 * @param code
	 */
	public GroupePersonne(String code) {
		setCode(code);
                setGroupesPortes(null);
                setPersonnes(null);
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

        public Collection<Employé> getPersonnes() {
            return personnes;
        }

        public void setPersonnes(Collection<Employé> personnes) {
            this.personnes = personnes;
        }

        public Collection<GroupePortes> getGroupesPortes() {
            return groupesPortes;
        }

        public void setGroupesPortes(Collection<GroupePortes> groupesPortes) {
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