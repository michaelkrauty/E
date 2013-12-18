package me.michaelkrauty.E.Operations;

import org.bukkit.entity.Player;

import me.michaelkrauty.E.Main;

public class PlayerChat extends Main{
	
	public static boolean playerchat(Player player){
		boolean bool = playerfile.getBoolean(player.getName() + ".muted");
		return bool;
	}
				
}
