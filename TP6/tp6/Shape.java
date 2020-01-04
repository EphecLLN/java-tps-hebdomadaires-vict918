package tp6;

public abstract class Shape {
	
	private int id;
	private int abscisse; 
	private int ordonne; 
	
	/*===============Cosntructor=================*/
	/*===============Get&Set=================*/
	public String getNom() {
		return this.getClass().getSimpleName() + "-" + this.id; 
	}
	/*===============HashCode Equals toString=================*/
	public String toString() {
		String result = "";
		result += this.getClass().getSimpleName() + "\n";
		result += this.abscisse + ";" + this.ordonne; 
		result += this.perimetre(); 
		result += this.surface(); 
		return result; 
	}
	/*===============Methode=================*/
	public abstract double surface();
	
	public abstract double perimetre(); 
	
	
	/*===============Main=================*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
