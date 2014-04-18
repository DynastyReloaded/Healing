package com.me.you;

import org.bukkit.ChatColor;
import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class SignListeners implements Listener{

	@EventHandler
	public void onSignChange(SignChangeEvent e) {
		if(e.getLine(0).equalsIgnoreCase("[Heal]")){
			e.setLine(0, "§a [Heal]");
			e.setLine(2,"§1 Click this");
			e.setLine(3, "§1 to be healed!");
		}
		if(e.getLine(0).equalsIgnoreCase("[Feed]")){
			e.setLine(0, "§a [Feed]");
			e.setLine(2,"§1 Click this");
			e.setLine(3, "§1 to be fed!");
		}
	}
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e){
		if(!(e.getAction() == Action.RIGHT_CLICK_BLOCK)) return;
		if(e.getClickedBlock().getState() instanceof Sign){
			Sign sign = (Sign) e.getClickedBlock().getState();
			if(sign.getLine(0).equalsIgnoreCase("§a [Heal]")){
				e.getPlayer().setHealth(20.0);
				e.getPlayer().sendMessage(ChatColor.GREEN + " You have been healed!");
			}
			if(sign.getLine(0).equalsIgnoreCase("§a [Feed]")){
				e.getPlayer().setFoodLevel(20);
				e.getPlayer().sendMessage(ChatColor.GREEN + " You have been fed!");
			}
		}
		
	}
	
}
