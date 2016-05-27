package command;

import game.Player;

public class CommandRight extends Command {

	public CommandRight(Player player, long timestamp) {
		super(player, timestamp);
	}

	@Override
	public void execute() {
		player.right();
	}

}
