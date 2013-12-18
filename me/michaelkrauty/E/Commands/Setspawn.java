package me.michaelkrauty.E.Commands;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.michaelkrauty.E.Main;

public class Setspawn extends Main{
	
	public static void setspawn(Boolean console, Player player, int arg, Location loc){
		spawn.set("spawn", loc);
	}
	
}
