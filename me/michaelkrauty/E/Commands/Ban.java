package me.michaelkrauty.E.Commands;

import me.michaelkrauty.E.Main;

import org.bukkit.entity.Player;

public class Ban extends Main{
	
	public static void teleport(Player player1, Player player2, String reason){
		if(plugin.getServer().getBannedPlayers().contains(player2.getName())){
			return;
		}
		player2.setBanned(true);
	}
	
}
