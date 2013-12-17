package me.michaelkrauty.E.Commands;

import org.bukkit.entity.Player;

import me.michaelkrauty.E.Main;

public class Fly extends Main{
	
	public static void fly(Boolean console, int arg, Player player1, String p2){
		Player player2 = plugin.getServer().getPlayer(p2);
		if(player2 != null){
			if(player2.isFlying()){
				player2.setFlying(true);
				player1.sendMessage("FlyPlayer1");
				if(!player1.hasPermission("fly.silent")){
					player2.sendMessage("FlyPlayer2");
				}
			}else{
				player1.sendMessage("FlyPlayer1AlreadyFlying");
			}
		}
	}
}
