package me.michaelkrauty.E.Commands;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.michaelkrauty.E.Main;

public class Setwarp extends Main{
	
	public static void setwarp(Boolean console, Player player, int arg, String warpname, Location loc){
		if(console){
			return;
		}
		warps.set(warpname, loc);
	}
	
}
