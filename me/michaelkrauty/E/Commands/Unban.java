package me.michaelkrauty.E.Commands;

import me.michaelkrauty.E.Main;

import org.bukkit.entity.Player;

public class Unban extends Main{
	
	public static void teleport(Player player1, Player player2){
		if(!plugin.getServer().getBannedPlayers().contains(player2.getName())){
			return;
		}
		player2.setBanned(false);
	}
	
}
