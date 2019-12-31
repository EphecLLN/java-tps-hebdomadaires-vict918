package tp5;

/**
 * Cette classe modélise une calculatrice simplifiée avec une valeur courante et trois opérations. 
 * @author Victor Cotton
 *
 */
public class Calculatrice {

/*=============VARIABLE D INSTANCES=================*/

	private double valeurCourante; // Stocke la valeur affichée sur l'écran de la calculatrice
	
/*=============CONSTRUCTEURS=================*/		

	/**
	 * Constructeur la classe Calculatrice
	 * @param valeurCourante
	 */
	public Calculatrice(double valeurCourante) {
		super();
		this.valeurCourante = valeurCourante;
	}

	public Calculatrice() {
		this.valeurCourante = 0;
	}	

/*=============Getters & Setters=================*/
	
	/**
	 * @return la valeurCourante actuellement affichée sur la calculatrice
	 */
	public double getValeurCourante() {
		return valeurCourante;
	}
	
	/**
	 * @param valeurCourante la nouvelle valeur à afficher sur la calculatrice
	 */
	public void setValeurCourante(double valeurCourante) {
		this.valeurCourante = valeurCourante;
	}
	
/*=============Methodes=================*/
	
	/**
	 * Additionne un nombre à la valeur courante
	 * @param n le nombre à ajouter à la valeur courante de la calculatrice
	 */
	public void ajoute(double n) {
		valeurCourante+=n;
	}
	
	/**
	 * Soustrait un nombre à la valeur courante
	 * @param n le nombre à soustraire à la valeur courante de la calculatrice
	 */
	public void soustrait(double n) {
		valeurCourante-=n;
	}
	
	/**
	 * Elève la valeur courante au carré
	 */
	public void carre() {
		valeurCourante*=valeurCourante;
	}
	
	/**
	 * Renvoie une représentation textuelle de la valeur affichée sur la calculatrice
	 */
	public String toString() {
		return "La calculatrice affiche la valeur " + getValeurCourante();
	}
	
	/**
	 * @param c un objet calculatrice 
	 * @return -1 si la valeure courante de celle ci est plus petite
	 * @return 1 si la valeure courante de celle ci est plus grande
	 * @return 0 si les valeures courantes sont egales 
	 */
	public int compareTo(Calculatrice c) {
		if(this.valeurCourante < c.getValeurCourante()) {return -1;}
		else if (this.valeurCourante > c.getValeurCourante()) {return 1;}
		else return 0; 
	}
	
/*=============Main=================*/		
	/**
	 * Méthode main permettant de lancer un test rapide de la classe calculatrice.
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String[] args) {

		
		Calculatrice myCalc = new Calculatrice(100);
		Calculatrice c2 = new Calculatrice(100);
		System.out.println(myCalc.compareTo(c2));
		
		//myCalc.ajoute(5);
		//myCalc.soustrait(2);
		//myCalc.setValeurCourante(5);
		//System.out.println(myCalc.valeurCourante);
	}

}
