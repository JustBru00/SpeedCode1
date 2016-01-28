package com.gmail.justbru00.epic.xpbank.main;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.justbru00.epic.xpbank.utls.Messager;

public class Main extends JavaPlugin {
	
	public static final String PREFIX = Messager.color("&8[&bEpic&fTextWarning&8] &f");
	public static ConsoleCommandSender console = Bukkit.getConsoleSender();
	public FileConfiguration config = getConfig();

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		return false;
	}

	@Override
	public void onDisable() {
		
	}

	@Override
	public void onEnable() {
		
	}

	
}
