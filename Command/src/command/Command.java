package command;

import game.Player;

public abstract class Command {

	protected Player player;
	protected long timestamp;
	
	public Command(Player player, long timestamp){
		this.player = player;
		this.timestamp = timestamp;
	}
	
	public abstract void execute();
	
	
	public long getTimestamp() {
		return timestamp;
	}

	@Override
	public String toString() {
		return String.format("%d %s", timestamp, getClass().toString());
	}
	
	public boolean shouldExecute(long currentTimeStamp){
		return currentTimeStamp >= timestamp;
	}
}
