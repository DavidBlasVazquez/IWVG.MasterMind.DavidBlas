package es.upm.miw.iwvg.mastermind.controllers;

import es.upm.miw.iwvg.mastermind.models.IGameModel;

public class GameController implements IGameController {
	protected IGameModel gameModel;
  
	public GameController(IGameModel gameModel) {
		this.gameModel = gameModel;
	}
	
	public boolean isFinished() {
		return gameModel.isFinished();
	}
	
	public boolean isWinner () {
		return gameModel.isWinner();
	}
	
	public int getDead() {
		return gameModel.getDead();
	}
	
	public int getWounded() {
		return gameModel.getWounded();
	}
	
	public void playAgain() {
		gameModel.playAgain();;
	}
	
	public IGameModel getModel() {
		return gameModel;
	}
}
