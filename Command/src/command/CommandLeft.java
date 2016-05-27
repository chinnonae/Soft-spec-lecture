package command;

import game.Player;

public class CommandLeft extends Command {

	public CommandLeft(Player player, long timestamp) {
		super(player, timestamp);
	}

	@Override
	public void execute() {
		player.left();
	}

}
