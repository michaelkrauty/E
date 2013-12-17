package me.michaelkrauty.E;

import java.util.logging.Logger;

import me.michaelkrauty.E.Commands.*;
import me.michaelkrauty.E.Operations.*;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("deprecation")
public class Main extends JavaPlugin implements Listener{
	
	public static SettingsManager conf = SettingsManager.getInstance();
	public static FileConfiguration lang = conf.getLang();
	public static FileConfiguration config = conf.getConfig();
	public static FileConfiguration playerfile = conf.getPlayerFile();
	public static FileConfiguration warps = conf.getPlayerFile();
	public static boolean console = false;
	
	public static Logger log = Logger.getLogger("MC");
	
	public static Plugin plugin;
	
	public void onEnable(){
		conf.setup(plugin);
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event){
		PlayerJoin.playerjoin(event.getPlayer());
	}
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event){
		PlayerMove.playermove(event.getPlayer());
	}
	@EventHandler
	public void onPlayerChat(PlayerChatEvent event){
		boolean muted = PlayerChat.playerchat(event.getPlayer());
		if(muted){
			event.setCancelled(true);
		}
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]){
		if(!(sender instanceof Player)){
			console = true;
		}
		
		Player player = (Player) sender;
		
		if(sender instanceof Player){
		}
		
		int x = player.getLocation().getBlockX();
		int y = player.getLocation().getBlockY();
		int z = player.getLocation().getBlockZ();
		float pitch = player.getLocation().getPitch();
		float yaw = player.getLocation().getYaw();
		Location loc = new Location(player.getWorld(), x, y, z, pitch, yaw);
		
		if(commandLabel.equalsIgnoreCase("su")){
			Su.su(console, player, args.length, args[0]);
		}
		
		
		if(commandLabel.equalsIgnoreCase("tp")){
			Tp.tp(console, args.length, player, args[0]);
			return true;
		}
		if(commandLabel.equalsIgnoreCase("tphere")){
			Tphere.tphere(console, args.length, player, args[0]);
			return true;
		}
		if(commandLabel.equalsIgnoreCase("tpall")){
			Tpall.tpall(console, args.length, player);
			return true;
		}
		if(commandLabel.equalsIgnoreCase("tppos")){
			Tppos.tppos(console, args.length, player, args[0], args[1], args[2]);
			return true;
		}
		if(commandLabel.equalsIgnoreCase("back")){
			Back.back(console, args.length, player, args[0]);
			return true;
		}
		if(commandLabel.equalsIgnoreCase("kill")){
			Kill.kill(console, args.length, player, args[0]);
			return true;
		}
		if(commandLabel.equalsIgnoreCase("fly")){
			Fly.fly(console, args.length, player, args[0]);
			return true;
		}
		if(commandLabel.equalsIgnoreCase("setwarp")){
			Setwarp.setwarp(console, player, args.length, args[0], loc);
			return true;
		}
		if(commandLabel.equalsIgnoreCase("warp")){
			Warp.warp(console, player, args.length, args[0], args[1]);
			return true;
		}
		if(commandLabel.equalsIgnoreCase("delwarp")){
			Delwarp.delwarp(console, player, args.length, args[0]);
			return true;
		}
		if(commandLabel.equalsIgnoreCase("sethome")){
			Sethome.sethome(console, player, args.length, args[0], loc);
			return true;
		}
		if(commandLabel.equalsIgnoreCase("home")){
			Home.home(console, player, args.length, args[0], args[1]);
			return true;
		}
		if(commandLabel.equalsIgnoreCase("delhome")){
			Delhome.delhome(console, player, args.length, args[0], args[1]);
			return true;
		}
		
		
		
		sender.sendMessage(lang.getString("UnknownCommand"));
		return true;
	}
	
}
