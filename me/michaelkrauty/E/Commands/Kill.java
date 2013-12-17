package me.michaelkrauty.E.Commands;

import org.bukkit.entity.Player;

import me.michaelkrauty.E.Main;

public class Kill extends Main{
	
	@SuppressWarnings("deprecation")
	public static void kill(Boolean console, int arg, Player player, String string){
		Player player2 = plugin.getServer().getPlayer(string);
		player2.setHealth(0);
		player.sendMessage(lang.getString("KillPlayer1"));
		if(!player.hasPermission("kill.silent")){
			player2.sendMessage(lang.getString("KillPlayer2"));
		}
	}
}
