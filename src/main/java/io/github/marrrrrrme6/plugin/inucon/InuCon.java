package io.github.marrrrrrme6.plugin.inucon;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class InuCon extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("startup plugin");
        Bukkit.getServer().getPluginManager().registerEvents(new EventListenerClass(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("shutdown plugin");
    }
}