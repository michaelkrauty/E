package me.michaelkrauty.E.Commands;

import me.michaelkrauty.E.Main;

import org.bukkit.entity.Player;

public class Tphere extends Main{
	
	public static void tphere(Boolean console, int arg, Player player1, String p2){
		if(!(plugin.getServer().getPlayer(p2) instanceof Player)){
			player1.sendMessage(lang.getString("TpherePlayer1PlayerNotFound"));
			return;
		}
		Player player2 = plugin.getServer().getPlayer(p2);
		player2.teleport(player1);
		player1.sendMessage("TpherePlayer1");
		if(!player1.hasPermission("tphere.silent")){
			player2.sendMessage("TpherePlayer2");
		}
	}
	
}
