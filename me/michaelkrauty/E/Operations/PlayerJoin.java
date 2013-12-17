package me.michaelkrauty.E.Operations;

import org.bukkit.entity.Player;

import me.michaelkrauty.E.Main;

public class PlayerJoin extends Main{
	
	public static void playerjoin(Player player){
		playerfile.set(player.getName() + ".online", true);
		conf.savePlayerFile();
		conf.reloadPlayerFile();
	}
}