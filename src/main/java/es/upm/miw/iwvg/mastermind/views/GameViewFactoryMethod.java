package es.upm.miw.iwvg.mastermind.views;

import es.upm.miw.iwvg.mastermind.controllers.IGameController;
import es.upm.miw.iwvg.mastermind.models.Color;
import es.upm.miw.iwvg.mastermind.models.IGameModel;
import es.upm.miw.iwvg.mastermind.utils.IO;

public abstract class GameViewFactoryMethod {
    protected IGameController controller;
    
	protected String drawSecretHidden() {
		String key = "";
	     for (int i = 0; i< Color.length(); i++) key += "*";
	     return key;
	}
	
	public GameViewFactoryMethod(IGameController controller) {
		this.controller = controller;
	}

	public void play () {
		IO console = new IO();
		boolean exit = false;
		do {
		     console.writeln("1. Partida");
		     console.writeln("2. Demo");
		     int option = console.readInt("Opción?");
		     console.writeln("Secreto: "+ drawSecretHidden() +"?");
		     factoryView(option).play();  
		     console.writeln("¿Quieres jugar otra vez?");
		     console.writeln("1. Sí");
		     console.writeln("2. No");
		     option = console.readInt("Opcion?");
		     if (option == 1) {
		    	 exit = false;
		         controller.playAgain();
		     }
		     else if (option == 2) 
		    	 exit = true;    	
		     console.writeln();
		} while (!exit); 
		
		console.writeln("Gracias por jugar. Adios.");
	}	
	
	abstract StrategyView factoryView(int option) ;
}
