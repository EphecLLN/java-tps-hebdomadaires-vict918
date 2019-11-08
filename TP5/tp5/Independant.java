package tp5;

public class Independant extends Personne {

	private String TVA; 
	
/*===========Constructeurs==============*/
	/**
	 * @param nom
	 * @param prenom
	 * @param registreNational
	 * @param TVA
	 */
	public Independant(String nom, String prenom, int registreNational, String TVA) {
		super(nom, prenom, registreNational);
		this.TVA = TVA; 
	}
/*========Getters & Setters============*/

	/**
	 * @return the tVA
	 */
	public String getTVA() {
		return TVA;
	}

	/**
	 * @param tVA the tVA to set
	 */
	public void setTVA(String tVA) {
		TVA = tVA;
	}

/*========Methodes==============*/
	/*
	 *@return true si l'object en parametre est le même que employe  
	 *@return Sinon false
	 */
	public boolean equals(Object other) {
	    if (other != null && other instanceof Independant) {
	    	Independant i = (Independant) other;
	        return ((this.TVA == i.TVA));
	    } else {
	        return false;
	    }
	}
	
	/*
	 * @return une String decrivant les valeurs de l'objet
	 */
	public String toString() {
		return "Nom : " + nom + ", Prenom : " + prenom + ", RegistreNational : " + registreNational
				+ ", TVA : " + TVA; 
		
	}
/*==========Main=============*/
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Independant i = new Independant("cotton", "victor", 123, "987"); 
		Independant a = new Independant("TOTO", "tata", 123, "15000"); 
		i.equals(a); 
		System.out.println(i);
	}
}
