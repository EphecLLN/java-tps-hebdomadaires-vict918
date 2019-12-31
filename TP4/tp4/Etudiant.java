package tp4;

import java.util.Date;

public class Etudiant {
	
/*=============VARIABLE D INSTANCES=================*/
	private String nom;
	private String prenom;
	private int matricule;
	private Date dateNaissance;
	
	private static int nbEtudiants;
	private int age;

/*=============CONSTRUCTEURS=================*/	
	
	public Etudiant(String nom, String prenom, Date dateNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = Integer.parseInt(2019 + "" + this.nbEtudiants);
		nbEtudiants ++; 
		this.dateNaissance = dateNaissance; 
		
	}
	
/*=============Methodes=================*/


	@Override
	public String toString() {
		return this.nom + " " + this.prenom; 
	}

	public boolean equals(Object other) {
		if (other != null && other instanceof Etudiant) {
			Etudiant e = (Etudiant) other;
		    return (this.matricule == e.matricule);
		 } 
		else {
			return false;
			    }
			}

	public int compareTo(Etudiant e) {
		String etu1 = this.toString(); 
		String etu2 = e.toString();
		return etu1.compareToIgnoreCase(etu2); 
	}
/*=============Getters & Setters=================*/
	
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
	 * @return the matricule
	 */
	public int getMatricule() {
		return matricule;
	}

	/**
	 * @param matricule the matricule to set
	 */
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	/**
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * @return the nbEtudiants
	 */
	public static int getNbEtudiants() {
		return nbEtudiants;
	}

	/**
	 * @param nbEtudiants the nbEtudiants to set
	 */
	public static void setNbEtudiants(int nbEtudiants) {
		Etudiant.nbEtudiants = nbEtudiants;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
/*=============Main=================*/	
	public static void main(String[] args) {
		Etudiant e = new Etudiant("Etestt", "Victor", new Date (05/01/2000)); 
		Etudiant b = new Etudiant("Damiens", "François", new Date (01/01/2000)); 
		System.out.println(e.compareTo(b)); 
	}


}
