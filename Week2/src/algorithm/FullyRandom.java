package algorithm;

import model.Board;

public class FullyRandom implements Algorithm{

	@Override
	public int getNextDirection(Board board, int limitSamplesCount) {
		int direction = (int) Math.round(Math.random()*1000);
//		switch(direction%4){
//		case 1:
//			return board.MOVE_UP;
//		case 2:
//			return board.MOVE_DOWN;
//		case 3:
//			return board.MOVE_LEFT;
//		default:
//			return board.MOVE_RIGHT;
//		}
		
		if(direction < 300) return board.MOVE_UP;
		else if(direction < 600) return board.MOVE_LEFT;
		else if(direction < 800) return board.MOVE_DOWN;
		else return board.MOVE_RIGHT;
	}

}
