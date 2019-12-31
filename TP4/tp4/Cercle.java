package tp4;

public class Cercle {
	/*=============VARIABLE D INSTANCES=================*/
	private double rayon; 
	private double aire;
	private double perimetre; 
	/*=============CONSTRUCTEURS=================*/	
	public Cercle(double rayon) {
		this.rayon = rayon; 
	}
	
	/*=============Methodes=================*/
	
	/**
	 * @return la valeure de l'aire si le rayon est un entier positif 
	 * @return 0 si le rayon est negatif ou est egale a 0 
	 */
	public double aireCercle() {
		if(this.rayon !=0 || this.rayon < 0) {
			return Math.pow(this.rayon, 2) * Math.PI; 
		}
		else return 0; 
	}
	
	/**
	 * @return le perimetre du cerlce 
	 * @return 0 si le rayon est negatif ou est egale a 0 
	 */
	public double perimetreCercle() {
		if(this.rayon !=0 || this.rayon < 0) {
			return Math.PI * 2 * this.rayon; 
		}
		else return 0; 
	}
	
	/**
	 * @param c un cerlce 
	 * @return -1 si le rayon est plus petit que celui mit en param
	 * @return 1 si le rayon est plus grand que celui mit en param
	 * @return 0 si les rayons sont egaux 
	 */
	public int compareTo(Cercle c) {
		if(this.rayon < c.rayon) {
			return -1;
		}
		if(this.rayon > c.rayon) {
			return 1;
		}
		return 0;
	}
	public String toString() {
		return "Le rayon du cerlce est de : " + this.rayon; 
	}
	
	public boolean equals(Object other) {
		if (other != null && other instanceof Cercle) {
			Cercle c = (Cercle) other;
		    return (this.rayon == c.rayon);
		 } 
		else {
			return false;
			    }
			}
	/*=============Getters & Setters=================*/
	/**
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}
	/**
	 * @param rayon the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	/**
	 * @return the aire
	 */
	public double getAire() {
		return aire;
	}
	/**
	 * @param aire the aire to set
	 */
	public void setAire(double aire) {
		this.aire = aire;
	}
	/**
	 * @return the perimetre
	 */
	public double getPerimetre() {
		return perimetre;
	}
	/**
	 * @param perimetre the perimetre to set
	 */
	public void setPerimetre(double perimetre) {
		this.perimetre = perimetre;
	}
	
	/*=============Main=================*/	
	public static void main(String[] args) {
		Cercle c1 = new Cercle(4); 
		System.out.println(c1);
		System.out.println(c1.aireCercle());
		System.out.println(c1.perimetreCercle());


	}

}
