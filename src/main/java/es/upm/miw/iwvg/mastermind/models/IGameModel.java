package es.upm.miw.iwvg.mastermind.models;

import java.util.List;

public interface IGameModel {
	 public void playAgain();    
	 public void valueCombination(List<Color> combination);    
	 public int getDead();	    
	 public int getWounded();    
	 public boolean isFinished();
	 public boolean isWinner();
	 public List<Color> getSecret();
}
