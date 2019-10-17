/**
 * 
 */
package tp3;

/**
 * @author vic91
 *
 */

public class Test {

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
	 * @return le perimetre du carre 
	 */
	public int perimetre(int n) {
		if(n > 0) {
			return n*4; 
		}
		else {
			System.out.println("longueur invalide");
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
		//Test nbrCarre = new Test();
		//nbrCarre.carre(10);
		//System.out.println(nbrCarre.carre(10));
		
		//Test nbrPair = new Test(); 
		//System.out.println(nbrPair.pair(-1));
		
		//Test phrase = new Test();
		//System.out.println(phrase.caract('a', "bb"));
		
		Test peri = new Test();
		System.out.println(peri.perimetre(3));
	}

}
