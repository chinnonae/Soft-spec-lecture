package main;

import controller.RemoteController;
import model.Board;
import algorithm.Algorithm;
import algorithm.FullyRandom;
import algorithm.MonteCarol;

public class AI2048Solver {

	Board board;
	private RemoteController controller;
	private Algorithm algorithm;
	
	
	public AI2048Solver() {
		board = new Board();
		controller = RemoteController.getInstance();
		algorithm = new FullyRandom();
		controller.init();
	}
	
	
	public void start() {
		board.setCells(controller.getBoardArray());
		while(!board.isEnd()) {
			int direction = algorithm.getNextDirection(board, 1000);
			controller.move(direction);
			board.setCells(controller.getBoardArray());			
			board.setCurrentScore(controller.getScore());;	
		}
	}
	
	
	
}
