package me.michaelkrauty.E.Commands;

import org.bukkit.entity.Player;

import me.michaelkrauty.E.Main;

public class Delhome extends Main{
	
	public static void delhome(Boolean console, Player player, int arg, String homename, String player2){
		playerfile.set(homename, null);
	}
	
}
