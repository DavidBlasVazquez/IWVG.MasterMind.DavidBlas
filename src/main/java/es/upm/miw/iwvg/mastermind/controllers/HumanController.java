package es.upm.miw.iwvg.mastermind.controllers;

import java.util.ArrayList;
import java.util.List;

import es.upm.miw.iwvg.mastermind.models.Color;
import es.upm.miw.iwvg.mastermind.models.IGameModel;

public class HumanController extends GameController { 	

	public HumanController(IGameModel gameModel) {
		super(gameModel);
	}
	
    public void evaluateStringCombination(String colors) {
		List<Color> combination = new ArrayList<>();
		for (int i = 0; i< colors.length(); i++) {
		    char letter = colors.charAt(i);
		    combination.add(Color.factory(String.valueOf(letter)));
		}
		this.gameModel.valueCombination(combination);
    }
}
