package me.migsect.MultiChannels.Commands;

import java.util.HashMap;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandHandler implements CommandExecutor
{
	private static HashMap<String, BaseCommand> commands = new HashMap<String, BaseCommand>();

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2,
			String[] arg3)
	{
		
		return true;
	}
}
