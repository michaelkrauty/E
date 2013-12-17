package me.michaelkrauty.E.Commands;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.michaelkrauty.E.Main;

public class Warp extends Main{
	
	public static void warp(Boolean console, Player player1, int arg, String warpname, String p2){
		if(console){
			return;
		}
		if(!(plugin.getServer().getPlayer(p2) instanceof Player)){
			return;
		}
		Player player2 = plugin.getServer().getPlayer(p2);
		player2.teleport((Location) warps.get(warpname));
	}
	
}
