package me.michaelkrauty.E;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class SettingsManager extends JavaPlugin{
	
	private SettingsManager(){}
	
	static SettingsManager instance = new SettingsManager();
	
	public static SettingsManager getInstance(){
		return instance;
	}
	
	Plugin p;
	FileConfiguration lang;
	File langfile;
	FileConfiguration player;
	File playerfile;
	FileConfiguration warps;
	File warpsfile;
	FileConfiguration sudoers; 
	File sudoersfile;
	
	public void setup(Plugin p){
		lang = p.getConfig();
		lang.options().copyDefaults(true);
		langfile = new File(p.getDataFolder(), "lang.yml");
		player = p.getConfig();
		player.options().copyDefaults(true);
		playerfile = new File(p.getDataFolder(), "players.yml");
		warps = p.getConfig();
		warps.options().copyDefaults(true);
		warpsfile = new File(p.getDataFolder(), "warps.yml");
	}
	
	public FileConfiguration getLang(){
		return lang;
	}
	
	public FileConfiguration getPlayerFile(){
		return player;
	}
	
	public FileConfiguration getWarps(){
		return warps;
	}
	
	public void saveLang(){
		try{
			lang.save(langfile);
		}catch (IOException e){
			getServer().getLogger().severe("Could not save lang.yml!");
		}
	}
	
	public void savePlayerFile(){
		try{
			player.save(playerfile);
		}catch(IOException e){
			getServer().getLogger().severe("Could not save players.yml!");
		}
	}
	
	public void saveWarps(){
		try{
			warps.save(warpsfile);
		}catch(IOException e){
			getServer().getLogger().severe("Could not save warps.yml!");
		}
	}
	
	public PluginDescriptionFile getDesc(){
		return p.getDescription();
	}
	
	public void reloadLang(){
		lang = YamlConfiguration.loadConfiguration(langfile);
	}
	
	public void reloadPlayerFile(){
		player = YamlConfiguration.loadConfiguration(playerfile);
	}
	
	public void reloadWarps(){
		warps = YamlConfiguration.loadConfiguration(warpsfile);
	}
}
