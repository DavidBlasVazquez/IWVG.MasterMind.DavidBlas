package es.upm.miw.iwvg.mastermind.views;

import es.upm.miw.iwvg.mastermind.controllers.DemoController;
import es.upm.miw.iwvg.mastermind.controllers.IGameController;
import es.upm.miw.iwvg.mastermind.utils.IO;

public class DemoView extends StrategyView {

	public DemoView(IGameController controller ) {
		super(controller);
	}

	@Override
	public void userAction() {
		IO console = new IO();
		DemoController demoController = (DemoController)this.controller;
		console.write(MESSAGE_PLAYING);
		demoController.createCombinationRandomColor();
		console.writeln(demoController.getCombinationAsString());
	}
}
