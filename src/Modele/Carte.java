package Modele;

import java.util.ArrayList;
import java.util.Collection;

public class Carte {

        public static int NUMERO = 0;
    
	Employé proprio;
	private int numCarte;
	private String codeCarte;

	/**
	 * 
	 * @param numCarte
	 * @param codeCarte
	 */
	public Carte(Employé proprio) {
		NUMERO++;
                setNumCarte(NUMERO);
                setProprio(proprio);
                setCodeCarte();
	}

        public Employé getProprio() {
            return proprio;
        }

        public void setProprio(Employé proprio) {
            this.proprio = proprio;
        }
        
        

	public int getNumCarte() {
		return this.numCarte;
	}

	/**
	 * 
	 * @param numCarte
	 */
	public void setNumCarte(int numCarte) {
		this.numCarte = numCarte;
	}

	public String getCodeCarte() {
		return this.codeCarte;
	}

	/**
	 * 
	 * @param codeCarte
	 */
	public void setCodeCarte() {
		this.codeCarte = "";
                ArrayList<GroupePersonne> gPers = getProprio().getGroupesPersonnes();
                for (int i=0; i<gPers.size(); i++){
                    this.codeCarte+=gPers.get(i).getCode();
                }
	}
        

}