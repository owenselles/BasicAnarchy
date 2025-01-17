package com.owenselles.basicanarchy;

import com.owenselles.basicanarchy.Commands.CommandHelp;
import com.owenselles.basicanarchy.Commands.CommandSuicide;
import com.owenselles.basicanarchy.Events.OnDeath;
import com.owenselles.basicanarchy.Events.OnPlayerChat;
import com.owenselles.basicanarchy.Events.OnPlayerJoin;
import org.bukkit.plugin.java.JavaPlugin;

public class BasicAnarchy extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("suicide").setExecutor(new CommandSuicide());
        this.getCommand("help").setExecutor(new CommandHelp());

        getServer().getPluginManager().registerEvents(new OnPlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new OnDeath(), this);
        getServer().getPluginManager().registerEvents(new OnPlayerChat(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }
}
