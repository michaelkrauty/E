package me.michaelkrauty.E.Commands;

import me.michaelkrauty.E.Main;

import org.bukkit.entity.Player;

public class Tpall extends Main{
	
	public static void tpall(Boolean console, int arg, Player player){
		if(console){
			return;
		}
		player.sendMessage(lang.getString("TpallPlayer1"));
		for(Player online : plugin.getServer().getOnlinePlayers()){
			online.teleport(player);
			if(!player.hasPermission("tpall.silent")){
				online.sendMessage("TpallPlayer2");
			}
		}
	}
	
}
