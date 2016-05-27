package game;

public class Player {

	public static final int SPEED = 5;
	
	private int pX, pY, vX, vY;
	
	public Player() {
		reset();
	}
	
	public void reset() {
		pX = 200;
		pY = 200;
		up();
	}
	
	public void move() {
		pX += vX;
		pY += vY;
	}
	
	public void up() {
		vX = 0;
		vY = -SPEED;
	}
	
	public void down() {
		vX = 0;
		vY = SPEED;
	}
	
	public void left() {
		vX = -SPEED;
		vY = 0;
	}
	
	public void right() {
		vX = SPEED;
		vY = 0;
	}
	
	public int getpX(){
		return pX;
	}
	
	public int getpY(){
		return pY;
	}
}
