package tp7.controller;

import tp7.model.Bibliotheque;
import tp7.view.BibliothequeVue;

public class BibliothequeController {
	Bibliotheque model; 
	BibliothequeVue vue;
	public BibliothequeController(Bibliotheque model) {
		this.model = model;
	}


	public void emprunteLivre(int numLivre) {
		if(model.emprunte(numLivre)) {
			vue.disableWarning(); 
		} 
		else {
			vue.enableWarning();
		}
		
	}

	public void rendreLivre(int numLivre) {
		model.rendre(numLivre);
		vue.disableWarning();
	}


	public void addView(BibliothequeVue vue) {
		this.vue = vue;
	}
}
