package Vue;


import Modele.Employé;
import Controleur.Controleur;
import java.util.Observable;

public abstract class Observateur {

	Controleur sujet;

	public abstract void update(Employé e);

}