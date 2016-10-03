package Vue;


import Modele.Employé;
import Controleur.Controleur;

public abstract class Observateur {

	Controleur sujet;

	/**
	 * 
	 * @param e
	 */
	public abstract void update(Employé e);

}