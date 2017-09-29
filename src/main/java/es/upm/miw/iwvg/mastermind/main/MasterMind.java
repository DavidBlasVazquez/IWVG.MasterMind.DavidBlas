package es.upm.miw.iwvg.mastermind.main;

import es.upm.miw.iwvg.mastermind.controllers.GameController;
import es.upm.miw.iwvg.mastermind.models.GameModel;
import es.upm.miw.iwvg.mastermind.views.GameView;

public class MasterMind {
	
	public void play () {
		GameView gameView = new GameView(new GameController(new GameModel()));
		gameView.play();
	}	

	public static void main(String[] args) {
		(new MasterMind()).play();
	}

}
