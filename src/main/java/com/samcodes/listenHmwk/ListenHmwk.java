package com.samcodes.ListenHmwk;
import org.bukkit.plugin.java.JavaPlugin;

public class ListenHmwk extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(PlayerListener, this);
    }
    @Override
    public void onDisable() {

    }
}