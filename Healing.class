package com.me.you;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Healing extends JavaPlugin {
	public void onEnable(){
		getServer().getPluginManager().registerEvents(new SignListeners(), this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd,
			String label, String[] args) {
		if(!(sender instanceof Player)){
			sender.sendMessage(ChatColor.RED + "Consoles can not use this Healing Plugin!");
		}
		
		Player player = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("Heal")){
			if(args.length == 0){
			player.setHealth(20.0);
			player.sendMessage(ChatColor.GREEN + "You have been healed!");
			return true;
			}
			Player target = Bukkit.getServer().getPlayer(args[0]);
			if(target == null){
				player.sendMessage(ChatColor.RED + "Player is not online!");
				return true;
			}
			target.setHealth(20.0);
			target.sendMessage(ChatColor.GREEN + "You have been healed by " + ChatColor.YELLOW + sender.getName() + ChatColor.GREEN + "!");
			player.sendMessage(ChatColor.GREEN + "You have healed " + ChatColor.YELLOW + target.getName() + ChatColor.GREEN + "!");
		}
		if(cmd.getName().equalsIgnoreCase("Feed")){
			if(args.length == 0){
			player.setFoodLevel(20);
			player.sendMessage(ChatColor.GREEN + "You have been Fed!");
			return true;
			}
			Player target = Bukkit.getServer().getPlayer(args[0]);
			if(target == null){
				player.sendMessage(ChatColor.RED + "Player is not online!");
				return true;
			}
			target.setFoodLevel(20);
			target.sendMessage(ChatColor.GREEN + "You have been fed by " + ChatColor.YELLOW + sender.getName() + ChatColor.GREEN + "!");
			player.sendMessage(ChatColor.GREEN + "You have fed " + ChatColor.YELLOW + target.getName() + ChatColor.GREEN + "!");
		}
		if(cmd.getName().equalsIgnoreCase("Kill")){
			if(args.length == 0){
			player.setHealth(0.0);
			player.sendMessage(ChatColor.RED + "You have committed suicide!");
			return true;
			}
			Player target = Bukkit.getServer().getPlayer(args[0]);
			if(target == null){
				player.sendMessage(ChatColor.RED + "Player is not online!");
				return true;
			}
			target.setHealth(0.0);
			target.sendMessage(ChatColor.RED + "You have been killed by " + ChatColor.YELLOW + sender.getName() + ChatColor.RED + "!");
			player.sendMessage(ChatColor.RED + "You have killed " + ChatColor.YELLOW + target.getName() + ChatColor.RED + "!");
		}return true;
	}
}
