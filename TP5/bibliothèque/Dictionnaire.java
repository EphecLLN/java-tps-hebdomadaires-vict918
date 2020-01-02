package bibliothèque;


import java.sql.Array;
import java.util.Arrays;

public class Dictionnaire extends Livre {
	
	private String[][] dictPages;
	
	//----------------------CONSTRUCTEURS-----------------------//
	public Dictionnaire(String nomAuteur, String titre, int anneeEdition) {
		super(nomAuteur, titre, anneeEdition); 
		this.dictPages = new String [100][10]; 
	}
	//---------------------GET & SET------------------------//
	
	public String getPage(int i) {
		if(i >= 0 && i < this.dictPages.length) {
			String result = ""; 
			for(int j = 0; j < dictPages[i].length; j++) {
				result += dictPages[i][j] +"\n"; 
			}
			return result; 
		}
		else {
			return null; 
		}
	}

	public String [] setPage(int i, String[] d) {
		if(i >= 0 && i < this.dictPages[i].length) {
			for (int j = 0; j < d.length; j++) {
				this.dictPages[i][j] = d[j];
			}
			return this.dictPages[i]; 
		}
		else {
			return null; 
		}
	}
	
	public String getFirstDefinition() {
		return this.dictPages[0][0];
	}
	
	public String getDefinition(int i, int j) {
		return this.dictPages[i][j];
	}
	public String setDefinition(int i, int j, String p) {
		String valeurAvant = this.dictPages[i][j];
		this.dictPages[i][j] = p;
		return valeurAvant;
	}
	
	public String extrait() {
		return this.dictPages[0][0];
	}
	//----------------------EQUALS & hashCode & ToString-----------------------//
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.deepHashCode(dictPages);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dictionnaire other = (Dictionnaire) obj;
		if (!Arrays.deepEquals(dictPages, other.dictPages))
			return false;
		return true;
	}
	
	public String toString() {
		String result; 
		result = "Nom d'auteur : " + this.nomAuteur + " Titre : " + this.titre + "AnneeEdition : " + this.anneeEdition;
		return result; 
	}
	//---------------------Methodes------------------------//
	
	//-----------------------MAIN-------------------------//

	public static void main(String[] args) {
		String [] pagesDico = {"1","2","3","4","5","6","7","8","9","10"};
		Dictionnaire monLivre = new Dictionnaire("victor", "LaRousse", 2019);
		
		
		monLivre.setPage(0, pagesDico);
		System.out.println(monLivre.setDefinition(0,3, "Le game"));
		System.out.println(monLivre.getDefinition(0, 3));


	}
	
}


