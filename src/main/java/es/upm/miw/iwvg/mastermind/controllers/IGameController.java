package es.upm.miw.iwvg.mastermind.controllers;

import es.upm.miw.iwvg.mastermind.models.IGameModel;

public interface IGameController {
	public boolean isFinished();		
	public boolean isWinner ();
	public int getDead();
	public int getWounded();
	public void playAgain();
	public IGameModel getModel();
}
