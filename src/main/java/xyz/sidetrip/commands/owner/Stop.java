package xyz.sidetrip.commands.owner;

import sx.blah.discord.handle.obj.IMessage;
import xyz.sidetrip.BanUtil;
import xyz.sidetrip.UtilDue;

public class Stop extends OwnerCommand {

	public Stop() {
		super("stop");
	}

	@Override
	public void execute(IMessage context, String... args) {
		UtilDue.sendMessage(context.getChannel(), ":wave: Stopping bot!");
		BanUtil.getClient().logout();
		System.exit(0);
	}

}
