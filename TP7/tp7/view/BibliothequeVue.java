package tp7.view;

import java.util.Observable;
import java.util.Observer;

import tp7.controller.BibliothequeController;
import tp7.model.Bibliotheque;

public abstract class BibliothequeVue implements Observer{
	
	protected Bibliotheque model;
	protected BibliothequeController controller;
	
	BibliothequeVue(Bibliotheque model,
			BibliothequeController controller) {
		this.model = model;
		this.controller = controller;
		this.model.addObserver(this); //connexion entre la vue et le modele
		}

	public abstract void affiche(String string) ;
	
	@Override
	public abstract void update(Observable o, Object arg);
	//public abstract void enableWarning();
	//public abstract void disableWarning(); 
}
