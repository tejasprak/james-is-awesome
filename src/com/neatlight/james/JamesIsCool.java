package com.neatlight.james;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


@SuppressWarnings("unused")
public final class JamesIsCool extends JavaPlugin {
	 
	public void onEnable(){
		getLogger().info("JamesIsAwesome is loading libraries.... complete! Btw; James is cooler than you.");
		getCommand("james").setExecutor(new JamesIsAwesomeCommandExecutor(this));
	}
	

 
	public void onDisable(){
		getLogger().info("Bye bye! James is Awesome!");
	}
}