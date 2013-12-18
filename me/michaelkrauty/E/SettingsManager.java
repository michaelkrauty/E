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
	FileConfiguration spawn;
	File spawnfile;
	public void setup(Plugin p){
		lang = p.getConfig();
		player = p.getConfig();
		warps = p.getConfig();
		spawn = p.getConfig();
		langfile = new File(p.getDataFolder(), "lang.yml");
		playerfile = new File(p.getDataFolder(), "players.yml");
		warpsfile = new File(p.getDataFolder(), "warps.yml");
		spawnfile = new File(p.getDataFolder(), "spawns.yml");
		lang.options().copyDefaults(true);
		player.options().copyDefaults(true);
		warps.options().copyDefaults(true);
		spawn.options().copyDefaults(true);
		saveLang();
		reloadLang();
		savePlayerFile();
		reloadPlayerFile();
		saveWarps();
		reloadWarps();
		saveSpawn();
		reloadSpawn();
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
	public FileConfiguration getSpawn(){
		return spawn;
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
	public void saveSpawn(){
		try{
			spawn.save(spawnfile);
		}catch(IOException e){
			getServer().getLogger().severe("Could not save spawns.yml!");
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
	public void reloadSpawn(){
		spawn = YamlConfiguration.loadConfiguration(spawnfile);
	}
}