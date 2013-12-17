package me.michaelkrauty.E.Commands;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.michaelkrauty.E.Main;

public class Home extends Main{
	
	public static void home(Boolean console, Player player, int arg, String homename, String player2){
		if(console){
			return;
		}
		player.teleport((Location) playerfile.get(player.getName() + ".homes." + homename));
	}
	
}