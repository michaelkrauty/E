package me.michaelkrauty.E.Commands;

import me.michaelkrauty.E.Main;

import org.bukkit.entity.Player;

public class Tp extends Main{
	
	public static void tp(Boolean console, int arg, Player player1, String p2){
		if(!(plugin.getServer().getPlayer(p2) instanceof Player)){
			player1.sendMessage(lang.getString("TeleportPlayer1PlayerNotFound"));
			return;
		}
		Player player2 = plugin.getServer().getPlayer(p2);
		player1.teleport(player2);
		player1.sendMessage(lang.getString("TeleportPlayer1"));
		if(!player1.hasPermission("teleport.silent")){
			player2.sendMessage(lang.getString("TeleportPlayer2"));
		}
	}
	
}
