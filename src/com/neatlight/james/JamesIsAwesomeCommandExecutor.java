package com.neatlight.james;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class JamesIsAwesomeCommandExecutor implements CommandExecutor {
	 
	@SuppressWarnings("unused")
	private JamesIsCool plugin; // pointer to your main class, unrequired if you don't need methods from the main class
 
	public JamesIsAwesomeCommandExecutor(JamesIsCool plugin) {
		this.plugin = plugin;
	}
 
	   @Override
       public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		   if (sender instanceof Player) {
			  Player player = (Player) sender;
			  player.sendMessage("JAMES IS AWESOME");
			  player.sendMessage("JAMES IS AWESOME");
			  player.sendMessage("JAMES IS AWESOME");
			  player.sendMessage("JAMES IS AWESOME");
			  player.sendMessage("JAMES IS AWESOME");
			  player.sendMessage("JAMES IS AWESOME");
			  player.sendMessage("JAMES IS AWESOME");
			  player.sendMessage("JAMES IS AWESOME");
			  player.sendMessage("JAMES IS AWESOME");
			  player.sendMessage("JAMES IS AWESOME");
			  player.sendMessage("JAMES IS AWESOME");
			  player.sendMessage("JAMES IS AWESOME");
			  player.sendMessage("JAMES IS AWESOME");
		   } else {
			   sender.sendMessage("You have to be a player to experience the god, James.");
			   return false;
		   }
		   return false;
               
       }
}