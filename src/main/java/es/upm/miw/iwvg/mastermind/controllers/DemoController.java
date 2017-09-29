package es.upm.miw.iwvg.mastermind.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import es.upm.miw.iwvg.mastermind.models.Color;
import es.upm.miw.iwvg.mastermind.models.GameModel;
import es.upm.miw.iwvg.mastermind.models.IGameModel;
import es.upm.miw.iwvg.mastermind.utils.Ramdon;

public class DemoController extends GameController {
   	private List<Color> combination;

	public DemoController(IGameModel gameModel) {
		super(gameModel);
	}
 
   	public String getCombinationAsString() {
   		Iterator<Color> iterator = combination.iterator();
   		String text = "";
   		while (iterator.hasNext()) {
   			text += iterator.next().name();
   		}
   		return text;
   	}
   	
	public void createCombinationRandomColor() {
		List<Color> combination = new ArrayList<>();
         Color[] valuesOfColor = Color.values();
		for (int i = 0; i< GameModel.MAX_SIZE_SECRET; i++) {
			int ramdonPosition = Ramdon.getRamdonNumber(valuesOfColor.length);
		    combination.add(valuesOfColor[ramdonPosition]);
		}
        this.combination = combination;
	    gameModel.valueCombination(combination);
	}
}
