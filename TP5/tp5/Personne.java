/**
 * 
 */
package tp5;

/**
 * @author vic91
 *
 */
public class Personne {
	protected String nom; 
	protected String prenom; 
	protected int registreNational; 

/*============Constructeur=============*/

	public Personne(String nom, String prenom, int registreNational) {
		super(); 
		this.nom = nom;
		this.prenom = prenom; 
		this.registreNational = registreNational; 
	}
/*=============Getters et setters=============*/	
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * @return the prenom
	 */
	
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * @return the registreNational
	 */
	public int getRegistreNational() {
		return registreNational;
	}
	
	/**
	 * @param registreNational the registreNational to set
	 */
	public void setRegistreNational(int registreNational) {
		this.registreNational = registreNational;
	}
	
	
/*==============Methodes=================*/
	
	/*
	 *@return true si l'object en parametre est le même que personne 
	 *@return Sinon false
	 */
	public boolean equals(Object other) {
	    if (other != null && other instanceof Personne) {
	    	Personne p = (Personne) other;
	        return ((this.registreNational == p.registreNational));
	    } else {
	        return false;
	    }
	}
	/*
	 * @return une String decrivant les valeurs de l'objet
	 */
	public String toString() {
		return "nom : " + nom + ", prenom : " + prenom + ", RegistreNational : " + registreNational; 
	}
/*=================Main===================*/
	public static void main(String[] args) {
		Personne p = new Personne("cotton", "victor", 123);
		System.out.println(p);
	}

}