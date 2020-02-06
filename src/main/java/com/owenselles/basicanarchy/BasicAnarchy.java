package com.owenselles.basicanarchy;

import org.bukkit.plugin.java.JavaPlugin;

public class BasicAnarchy extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("onEnable is called!");
        this.getCommand("suicide").setExecutor(new CommandSuicide());

    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }
}
