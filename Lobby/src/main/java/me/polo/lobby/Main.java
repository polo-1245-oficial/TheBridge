package me.polo.lobby;

import me.polo.lobby.events.PlayerJoinEvent;
import me.polo.lobby.events.PlayerQuitEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§a[+] lobby plugin iniciado");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§c[-] lobby plugin quitao");
    }

    public void cmds(){
        //getCommand("asd").setExecutor(new asd(this));
    }
    public void events(){
        PluginManager pm = getServer().getPluginManager();
        //pm.registerEvents(new PlayerJoinEvent(this), this);
        pm.registerEvents(new PlayerJoinEvent(), this);
        pm.registerEvents(new PlayerQuitEvent(), this);
    }
}
