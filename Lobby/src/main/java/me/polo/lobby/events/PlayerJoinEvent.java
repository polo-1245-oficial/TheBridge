package me.polo.lobby.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerJoinEvent implements Listener {

    @EventHandler
    public void PlayerJoinEvent(org.bukkit.event.player.PlayerJoinEvent e){
        Player p = e.getPlayer();

        Bukkit.getConsoleSender().sendMessage("§6[§4§lLogs§r§6] " + p.getDisplayName() + " se unió");
        Bukkit.broadcastMessage("§a+ " + p.getDisplayName());
    }
}
