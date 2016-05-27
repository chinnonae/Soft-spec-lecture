package command;

import game.Player;

public class CommandDown extends Command {

	public CommandDown(Player player, long timestamp) {
		super(player, timestamp);
	}

	@Override
	public void execute() {
		player.down();
	}

	
	
	

}
