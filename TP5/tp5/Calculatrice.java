package tp5;


/**
 * Cette classe modélise une calculatrice simplifié avec une valeure courante et trois opérations. 
 * @author victor
 *
 */
public class Calculatrice {
	
	private double valeurCourante; // Stocke la valeur affichée sur l'écran de la calculatrice

/*================Constructeur===========*/
	
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

/*================Getters & Setters===========*/
	
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
	
/*================Methodes===========*/
	
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

	
/*================Main===========*/
	/**
	 * Méthode main permettant de lancer un test rapide de la classe calculatrice.
	 * @param args les arguments de la ligne de commande
	 */
	public static void main(String[] args) {
		Calculatrice myCalc;
		
		if(args.length==0) {
			myCalc = new Calculatrice();
		}
		else {
			myCalc = new Calculatrice(Double.parseDouble(args[0]));
		}
		System.out.println(myCalc);
	}
}
