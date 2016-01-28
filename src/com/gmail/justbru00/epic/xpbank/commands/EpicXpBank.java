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
package com.gmail.justbru00.epic.xpbank.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.gmail.justbru00.epic.xpbank.main.Main;
import com.gmail.justbru00.epic.xpbank.utls.Messager;

public class EpicXpBank implements CommandExecutor {
	
	Main main;
	
	public EpicXpBank(Main main) {
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("epicxpbank")) {
			if (args.length > 1 || args.length == 0) {
				Messager.msgSender(main.getConfigString("messages.epicxpbank.not enough args"), sender);
				return true;
			}
			
			if (args[0].equalsIgnoreCase("license")) {
				Messager.msgSender("Visit: http://choosealicense.com/licenses/mit/ for the license.", sender);
				return true;
			} else if (args[0].equalsIgnoreCase("info")) {
				Messager.msgSender("Version: " + main.PLUGIN_VERSION + ". EpicXpBank created by Justin Brubaker.", sender);
				return true;
			}
						
			return true;
		}		
		return false;
	}

}
