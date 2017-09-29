package es.upm.miw.iwvg.mastermind.views;

import es.upm.miw.iwvg.mastermind.controllers.DemoController;
import es.upm.miw.iwvg.mastermind.controllers.HumanController;
import es.upm.miw.iwvg.mastermind.controllers.IGameController;
import es.upm.miw.iwvg.mastermind.models.IGameModel;

public class GameView extends GameViewFactoryMethod{
    public GameView(IGameController controller) {
		super(controller);
	}
	
	public StrategyView factoryView(int option) {  	 
		StrategyView userView = null;
		 IGameModel gameModel = controller.getModel();
	     if (option == 1) {
	    	 userView = new HumanView(new HumanController(gameModel));
	     }
	     else if (option == 2) {
	    	 userView = new DemoView(new DemoController(gameModel));
	     }
	     return userView;
	}
}
