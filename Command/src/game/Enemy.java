package game;

public class Enemy {

	private int pX, pY;
	
	public boolean hitPlayer(Player player){
		int dX = player.getpX() - pX;
		int dY = player.getpY() - pY;
		double distance = Math.sqrt(dX * dX + dY * dY);
		
		return distance < 30;
	}
	
	public int getPX(){
		return pX;
	}
	
	public int getPY(){
		return pY;
	}
}
