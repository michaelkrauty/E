package me.michaelkrauty.E.Commands;

import org.bukkit.entity.Player;

import me.michaelkrauty.E.Main;

public class Unmute extends Main{
	
	public static void unmute(Boolean console, Player player, int arg, String p2){
		if(!(plugin.getServer().getPlayer(p2) instanceof Player)){
			return;
		}
		Player player2 = plugin.getServer().getPlayer(p2);
		playerfile.set(player2.getName() + ".muted", false);
	}
	
}
