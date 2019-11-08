package tp5;


/**
 * Cette classe mod�lise une calculatrice simplifi� avec une valeure courante et trois op�rations. 
 * @author victor
 *
 */
public class Calculatrice {
	
	private double valeurCourante; // Stocke la valeur affich�e sur l'�cran de la calculatrice

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
	 * @return la valeurCourante actuellement affich�e sur la calculatrice
	 */
	public double getValeurCourante() {
		return valeurCourante;
	}
	
	/**
	 * @param valeurCourante la nouvelle valeur � afficher sur la calculatrice
	 */
	public void setValeurCourante(double valeurCourante) {
		this.valeurCourante = valeurCourante;
	}
	
/*================Methodes===========*/
	
	/**
	 * Additionne un nombre � la valeur courante
	 * @param n le nombre � ajouter � la valeur courante de la calculatrice
	 */
	public void ajoute(double n) {
		valeurCourante+=n;
	}
	/**
	 * Soustrait un nombre � la valeur courante
	 * @param n le nombre � soustraire � la valeur courante de la calculatrice
	 */
	public void soustrait(double n) {
		valeurCourante-=n;
	}
	
	/**
	 * El�ve la valeur courante au carr�
	 */
	public void carre() {
		valeurCourante*=valeurCourante;
	}
	
	/**
	 * Renvoie une repr�sentation textuelle de la valeur affich�e sur la calculatrice
	 */
	public String toString() {
		return "La calculatrice affiche la valeur " + getValeurCourante();
	}

	
/*================Main===========*/
	/**
	 * M�thode main permettant de lancer un test rapide de la classe calculatrice.
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
