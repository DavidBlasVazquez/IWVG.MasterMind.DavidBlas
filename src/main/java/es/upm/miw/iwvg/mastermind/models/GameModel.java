package es.upm.miw.iwvg.mastermind.models;

import java.util.ArrayList;
import java.util.List;

import es.upm.miw.iwvg.mastermind.utils.Ramdon;

public class GameModel extends GameLiterals implements IGameModel {
	static public int MAX_ATTEMPTS = 10;
    private List<Color> secret;
    private IGameRow lastRow;
    private int countAttempts;
    private void init() {
		countAttempts = 0;
		createSecret();
		lastRow = null;
    }

    private void createSecret() {
        secret = new ArrayList<Color>();
        Color[] valuesOfColor = Color.values();
    	for(int i = 0; i< MAX_SIZE_SECRET; i++ ) {
    		int ramdonPosition = Ramdon.getRamdonNumber(valuesOfColor.length);
            secret.add(valuesOfColor[ramdonPosition] );
    	}
    }
    
    public GameModel() {
       	init();
	}
    
    public void playAgain() {
        init();
    }	
    
    public void valueCombination(List<Color> combination) {
		countAttempts++;
		lastRow = new GameRow(combination, secret);
	}
    
    public int getDead() {
    	    return lastRow.getDead();
    }
    
    public int getWounded() {
    	    return lastRow.getWounded();
    }
    
	public boolean isFinished() {
		return MAX_ATTEMPTS == countAttempts || isWinner();
	}

	public boolean isWinner() {
		return lastRow.isMatch();
	}
	
	public List<Color> getSecret() {
		return secret;
	}
	
}
