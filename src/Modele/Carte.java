package Modele;

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
	public Carte(Employé proprio, String codeCarte) {
		NUMERO++;
                setNumCarte(NUMERO);
                setProprio(proprio);
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
	public void setCodeCarte(String codeCarte) {
		this.codeCarte = codeCarte;
	}
        

}