package me.michaelkrauty.E.Commands;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.michaelkrauty.E.Main;

public class Spawn extends Main{
	
	public static void spawn(Boolean console, Player player, int arg, String args){
		player.teleport((Location) spawn.get("spawn"));
	}

}
