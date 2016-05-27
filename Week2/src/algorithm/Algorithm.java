package algorithm;

import model.Board;

public interface Algorithm {
	
	public int getNextDirection(Board board, int limitSamplesCount);
}
