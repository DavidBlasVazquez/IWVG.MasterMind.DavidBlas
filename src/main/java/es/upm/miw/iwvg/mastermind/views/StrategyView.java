package es.upm.miw.iwvg.mastermind.views;

import es.upm.miw.iwvg.mastermind.controllers.IGameController;
import es.upm.miw.iwvg.mastermind.models.GameLiterals;
import es.upm.miw.iwvg.mastermind.utils.IO;

public abstract class StrategyView extends GameLiterals {
	static public String MESSAGE_PLAYING = "Intento? [cuatro letras de entreA-amarillo," +
	                                          "R-rojo, V-verde, Z-azul, B-blanco, N-negro]";
	
	protected IGameController controller;
	
	public StrategyView(IGameController controller) {
		this.controller = controller;
	}
	
	public void play() {
		IO console = new IO();		
		do {
			userAction();
			int dead = controller.getDead();
			int wounded = controller.getWounded();
			if (controller.isWinner())
				console.writeln(MAX_SIZE_SECRET + " muertos!!! Victoria");
			else
			    console.writeln(dead + " muertos y "+  wounded + " heridos");		
		}
		while (!controller.isFinished());
		
		if (!controller.isWinner())
			console.writeln("Has perdido. Superado el máx. de intentos.");
	}
	
	abstract  public void userAction ();
}
