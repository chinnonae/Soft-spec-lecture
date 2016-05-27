package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import command.Command;
import command.CommandDown;
import command.CommandLeft;
import command.CommandRight;
import command.CommandUp;

public class Game extends Observable{

	private Player player;
	private Enemy enemy;
	private boolean running;
	private CommandUp commandUp;
	private CommandDown commandDown;
	private CommandLeft commandLeft;
	private CommandRight commandRight;
	private long startTime;
	
	private List<Command> commands;
	
	public Game() {
		player = new Player();
		enemy = new Enemy();
		running = false;
	}
	
	public void startReplay(){
		
		System.out.println("start replay");
		
		final List<Command> replayCommand = new ArrayList<Command>();
		replayCommand.addAll(commands);
		
		
		
		Thread replayThread = new Thread(){
			
			@Override
			public void run() {
				super.run();
				while(!replayCommand.isEmpty()){
					Command c = replayCommand.get(0);
					long currentTime = currentGameTime();
					if(c.shouldExecute(currentTime)){
						c.execute();
						replayCommand.remove(0);
					}
					delay();
				}
			}
		};
		startGame();
		replayThread.start();
		
		
		
		
	}
	
	public void startGame(){
		
		player.reset();
		running = true;
		commands = new ArrayList<Command>();
		Thread gameThraed = new Thread(){
			@Override
			public void run() {
				super.run();
				while(running){
					delay();
					//Game Logic
					player.move();
					if(enemy.hitPlayer(player)){
						running = false;
					}
					//Update Observer;
					setChanged();
					notifyObservers();
				}
			}
		};
		startTime = System.currentTimeMillis();
		gameThraed.start();
	}
	
	public void turnUp() {
		storeAndExecute(new CommandUp(player, currentGameTime()));
	}
	
	public void turnDown() {
		storeAndExecute(new CommandDown(player, currentGameTime()));
		
	}
	
	public void turnLeft() {
		storeAndExecute(new CommandLeft(player, currentGameTime()));
	}
	
	public void turnRight() {
		storeAndExecute(new CommandRight(player, currentGameTime()));
	}
	
	public int getPX(){
		return player.getpX();
	}
	
	public int getPY(){
		return player.getpY();
	}
	
	public int getEX(){
		return enemy.getPX();
	}
	
	public int getEY(){
		return enemy.getPY();
	}
	
	public void delay() {
		try{
			Thread.sleep(20);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	private long currentGameTime(){
		return System.currentTimeMillis()-startTime;
	}
	
	private void storeAndExecute(Command command){
		commands.add(command);
		command.execute();
		System.out.println(command);
	}
}
