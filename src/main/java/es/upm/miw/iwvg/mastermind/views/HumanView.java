package es.upm.miw.iwvg.mastermind.views;

import es.upm.miw.iwvg.mastermind.controllers.HumanController;
import es.upm.miw.iwvg.mastermind.controllers.IGameController;
import es.upm.miw.iwvg.mastermind.models.GameLiterals;
import es.upm.miw.iwvg.mastermind.utils.IO;

public class HumanView extends StrategyView {

	public HumanView(IGameController controller ) {
		super(controller);
	}

	@Override
	public void userAction() {
		IO console = new IO();
		HumanController humanController = (HumanController)controller;
		String stringCombination = console.readString(MESSAGE_PLAYING);
		while (stringCombination.length() !=  GameLiterals.MAX_SIZE_SECRET) {
			console.writeln("Debe tener " + GameLiterals.MAX_SIZE_SECRET + " letras");
			stringCombination = console.readString(MESSAGE_PLAYING);
		}
		humanController.evaluateStringCombination(stringCombination);
	}
}
