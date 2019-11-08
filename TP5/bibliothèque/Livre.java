
package bibliothèque;

import java.util.Arrays;

import tp5.Employe;

/**
 * @author victor
 *
 */
public class Livre {
	protected String nomAuteur; 
	protected String titre; 
	protected int anneEdition; 
	protected String [] pageLivre; 
	//pageLivre = new String[100];
	
	/*--------Getters & Setters---------*/
	/**
	 * @return the nomAuteur
	 */
	public String getNomAuteur() {
		return nomAuteur;
	}

	/**
	 * @param nomAuteur the nomAuteur to set
	 */
	public void setNomAuteur(String nomAuteur) {
		if(nomAuteur == "") {
			this.nomAuteur = "Auteur inconnu"; 
		} else {
			this.nomAuteur = nomAuteur;
		}
	}

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		if(titre == "") {
			this.titre = "Titre inconnu";
		} else{
			this.titre = titre;
		}
	}

	/**
	 * @return the anneEdition
	 */
	public int getAnneEdition() {
		return anneEdition;
	}

	/**
	 * @param anneEdition the anneEdition to set
	 */
	public void setAnneEdition(int anneEdition) {
		this.anneEdition = anneEdition;
	}

	/**
	 * @return the pageLivre
	 */
	public String[] getPageLivre() {
		return pageLivre;
	}

	/**
	 * @param pageLivre the pageLivre to set
	 */
	public void setPageLivre(String[] pageLivre) {
		this.pageLivre = pageLivre;
	}
	
	/*-----------Methodes---------------------*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anneEdition;
		result = prime * result + ((nomAuteur == null) ? 0 : nomAuteur.hashCode());
		result = prime * result + Arrays.hashCode(pageLivre);
		result = prime * result + ((titre == null) ? 0 : titre.hashCode());
		return result;
	}

	/*
	 *@return true si l'object en parametre est le même que Livre 
	 *@return Sinon false
	 */
	public boolean equals(Object other) {
	    if (other != null && other instanceof Livre) {
	    	Livre l = (Livre) other;
	        return ((this.titre == l.titre));
	    } else {
	        return false;
	    }
	}


	/*-------------Main------------------*/
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
