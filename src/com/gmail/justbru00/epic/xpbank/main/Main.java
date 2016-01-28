/**
 * The MIT License (MIT)

Copyright (c) 2016 Justin Brubaker

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

 */
package com.gmail.justbru00.epic.xpbank.main;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.justbru00.epic.xpbank.commands.DepositXp;
import com.gmail.justbru00.epic.xpbank.commands.EpicXpBank;
import com.gmail.justbru00.epic.xpbank.commands.WithdrawXp;
import com.gmail.justbru00.epic.xpbank.utls.Messager;

public class Main extends JavaPlugin {
	
	public static final String PREFIX = Messager.color("&8[&bEpic&fXpBank&8] &f");
	public static ConsoleCommandSender console = Bukkit.getConsoleSender();
	public FileConfiguration config = getConfig();	
	public final String PLUGIN_VERSION = this.getDescription().getVersion();

	@Override
	public void onDisable() {
		Messager.msgConsole("&cPlugin Disabled.");
	}

	@Override
	public void onEnable() {
		Messager.msgConsole("&bThis plugin was created by Justin Brubaker. Please report any bugs at: https://github.com/JustBru00/SpeedCode1/issues");
		Messager.msgConsole("&aStarting enable.");		
		
		getCommand("epicxpbank").setExecutor(new EpicXpBank(this));
		getCommand("depositxp").setExecutor(new DepositXp(this));
		getCommand("withdrawxp").setExecutor(new WithdrawXp(this));
		
		Messager.msgConsole("&aPlugin enabled successfully.");
	}

	public String getConfigString(String path) {
		return Messager.color(config.getString(path));
	}
}
