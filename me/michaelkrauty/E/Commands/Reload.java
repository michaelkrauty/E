package me.michaelkrauty.E.Commands;

import org.bukkit.entity.Player;

import me.michaelkrauty.E.Main;

public class Reload extends Main{
	
	public static void reload(Boolean console, Player player){
		conf.reloadLang();
		conf.reloadConfig();
		conf.reloadPlayerFile();
		if(console){
			log.info(lang.getString("ReloadConsole"));
		}else{
			player.sendMessage(lang.getString("ReloadPlayer"));
			log.info(lang.getString("ReloadConsole"));
		}
	}
}
