package Modele;

public class Porte {

        public static int idPorte = 0;
    
	private GroupePortes groupePortes;
	private int id;
	private boolean etatVoyantVert;

	/**
	 * 
	 * @param id
	 */
	public Porte() {
		// TODO - implement Porte.Porte
		idPorte++;
                setGroupePortes(null);
                setId(idPorte);
                setEtatVoyantVert(false);
	}

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public boolean getEtatVoyantVert() {
		return this.etatVoyantVert;
	}

	/**
	 * 
	 * @param etatVoyantVert
	 */
	public void setEtatVoyantVert(boolean etatVoyantVert) {
		this.etatVoyantVert = etatVoyantVert;
	}

        /**
         * @return the groupePortes
         */
        public GroupePortes getGroupePortes() {
            return groupePortes;
        }

        /**
         * @param groupePortes the groupePortes to set
         */
        public void setGroupePortes(GroupePortes groupePortes) {
            this.groupePortes = groupePortes;
        }
        
        

}