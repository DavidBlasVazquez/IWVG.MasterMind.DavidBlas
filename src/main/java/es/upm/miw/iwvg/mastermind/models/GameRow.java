package es.upm.miw.iwvg.mastermind.models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import es.upm.miw.iwvg.mastermind.models.GameRow;

public class GameRow implements IGameRow {
	static public Integer NUMBER_OF_DEAD_FOR_WINNER = 4;
    private List<Color> combination;
    private List<Color> secret;
    private int deads;
    private int woundeds;
        
	GameRow(List<Color> combination, List<Color> secret) {
		this.combination = combination;
		this.secret = secret;
		deads = 0;		
		woundeds = 0;		
		valueCombination();
	}
	
    public void valueCombination () {
		Set<Integer> checkCombination = new HashSet<Integer>();
		Set<Integer> checkSecret = new HashSet<Integer>();
		
		// I must to priority the deads so that I can to avoid false wounded.
		for (int i = 0; i < secret.size(); i++) {
			boolean isDead = secret.get(i)  == combination.get(i);
			if (isDead)  {
				deads++;
				checkSecret.add(i);
				checkCombination.add(i);
			}
		}
		// I am founding out woundeds.
		for (int i = 0; i <secret.size(); i++) {
			for (int j = 0; j<combination.size(); j++) {
				if (!checkCombination.contains(j) && !checkSecret.contains(i)) {
					if (secret.get(i) == combination.get(j)) {
						woundeds++;
						checkCombination.add(j);
						checkSecret.add(i);
					}
				}
			}
		}	
	}

	public boolean isMatch() {
		return deads == GameRow.NUMBER_OF_DEAD_FOR_WINNER;
	}
	
	public int getDead() {
		return deads;
	}
	
	public int getWounded() {
		return woundeds;
	}
}
