package command;

import game.Player;

public class CommandUp extends Command{

	public CommandUp(Player player, long timestamp) {
		super(player, timestamp);
	}

	@Override
	public void execute() {
		player.up();
	}

}
