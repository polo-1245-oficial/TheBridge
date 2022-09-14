package me.polo.lobby.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerQuitEvent implements Listener {

    @EventHandler
    public void PlayerQuitEvent(org.bukkit.event.player.PlayerQuitEvent e){
        Player p = e.getPlayer();

        Bukkit.getConsoleSender().sendMessage("§6[§4§lLogs§r§6] " + p.getDisplayName() + " se salió");
        Bukkit.broadcastMessage("§c- " + p.getDisplayName());
    }
}
