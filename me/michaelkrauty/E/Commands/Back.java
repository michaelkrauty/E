package me.michaelkrauty.E.Commands;

import me.michaelkrauty.E.Main;

import org.bukkit.entity.Player;

public class Back extends Main{
	
	public static void back(Boolean console, int arg, Player player, String string){
		player.sendMessage(lang.getString("BackPlayer1"));
	}
	
}
