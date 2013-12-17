package me.michaelkrauty.E.Commands;

import org.bukkit.entity.Player;

import me.michaelkrauty.E.Main;

public class Delwarp extends Main{
	
	public static void delwarp(Boolean console, Player player, int arg, String warpname){
		warps.set(warpname, null);
	}
	
}
