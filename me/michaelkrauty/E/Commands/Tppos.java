package me.michaelkrauty.E.Commands;

import me.michaelkrauty.E.Main;

import org.bukkit.entity.Player;

public class Tppos extends Main{
	
	public static void tppos(Boolean console, int arg, Player player, String x, String y, String z){
		player.sendMessage(lang.getString("TpposPlayer1"));
	}
	
}
