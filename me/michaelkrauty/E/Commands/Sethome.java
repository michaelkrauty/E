package me.michaelkrauty.E.Commands;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.michaelkrauty.E.Main;

public class Sethome extends Main{
	
	public static void sethome(Boolean console, Player player, int arg, String homename, Location loc){
		if(console){
			return;
		}
		playerfile.set(player.getName() + ".homes." + homename, loc);
	}
	
}
