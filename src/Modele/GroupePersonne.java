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
		// TODO - implement GroupePersonne.GroupePersonne
		throw new UnsupportedOperationException();
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

}