/**
 * 
 */
package tp3;

/**
 * @author vic91
 *
 */

public class Fonction {

	//================Methodes================//
	/**
	* Cette méthode calcule le carré d’un nombre.
	* @param n : Un nombre entier quelconque
	* @return Un nombre >= 0, résultat de la multiplication de n par lui-même
	*/
	public int carre(int n){
		return n*n;
	}
	
	/**
	 * Cette méthode vérifie si un nombre est pair 
	 * @param n : un nombre entier quelconque 
	 * @return une string disant si pair ou impair
	 */
	public String pair(int n) {
		if ((n % 2) == 0) {
			return "Le nombre " + n + " est pair"; 
		}
		else {
			return "Le nombre " + n + " est impair";
		}
	}
	
	/**
	 * Cette methode renvoie le perimetre d'un carre sur base de la longueur n de son cote
	 * @param n la longueur d'un cote du carre, ce nombre doit etre un entier positif
	 * @return le perimetre du carre sinon si nombre negatif retourne -1
	 */
	public int perimetre(int n) {
		if(n > 0) {
			return n*4; 
		}
		else {
			return -1; 
		}
	}
	
	/**
	 * Cette méthode verifie si un caractere c est contenu dans une string chaine
	 * @param c le caractère a verifier
	 * @param chaine la string a comparer avec le caractère
	 * @return un int le nombre de fois qu'apparait le caractere
	 */
	public int caract(char c, String chaine) {
		int compteur = 0; 
		for (int i = 0; i < chaine.length(); i++) {
			if(c == chaine.charAt(i)) {
				compteur = compteur + 1; 
			}
		}
		return compteur; 
	}
//===========================================================\\	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Fonction nbrCarre = new Fonction();
		//nbrCarre.carre(10);
		//System.out.println(nbrCarre.carre(10));
		
		//Fonction nbrPair = new Fonction(); 
		//System.out.println(nbrPair.pair(-1));
		
		//Fonction phrase = new Fonction();
		//System.out.println(phrase.caract('a', "bb"));
		
		//Fonction peri = new Fonction();
		//System.out.println(peri.perimetre());
	}

}
