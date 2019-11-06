/**
 * 
 */
package tp5;

/**
 * @author vic91
 *
 */
public class Employe extends Personne{

	private int salaire; 
	private String employeur; 

	

/*=============Constructeur==========*/	
/**
	 * @param nom
	 * @param prenom
	 * @param registreNational
	 * @param salaire
	 * @param employeur
	 */
	public Employe(String nom, String prenom, int registreNational, int salaire, String employeur) {
		super(nom, prenom, registreNational);
		this.salaire = salaire;
		this.employeur = employeur; 
	}
/*======Getters & Setters==============*/

	/**
	 * @return the salaire
	 */
	public int getSalaire() {
		return salaire;
	}


	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}


	/**
	 * @return the employeur
	 */
	public String getEmployeur() {
		return employeur;
	}


	/**
	 * @param employeur the employeur to set
	 */
	public void setEmployeur(String employeur) {
		this.employeur = employeur;
	}


/*==========Methodes=============/
	
	/*
	 *@return true si l'object en parametre est le même que personne 
	 *@return Sinon false
	 */
	public boolean equals(Object other) {
	    if (other != null && other instanceof Employe) {
	    	Employe e = (Employe) other;
	        return ((this.employeur == e.employeur));
	    } else {
	        return false;
	    }
	}
	
	/*
	 * @return une String decrivant les valeurs de l'objet
	 */
	public String toString() {
		return "nom : " + nom + ", prenom : " + prenom + ", RegistreNational : " + registreNational
				+ ", Salaire : " + salaire +", Employeur : " + employeur; 
		
	}

/*=========Methode Main=======*/
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employe e = new Employe("cotton", "victor", 123, 15000, "GG"); 
		Employe a = new Employe("cotton", "victor", 123, 15000, "GGG"); 
		e.equals(a); 
		System.out.println(e.equals(a));
	}

}
