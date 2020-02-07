package com.owenselles.basicanarchy.Events;

import com.owenselles.basicanarchy.Utils.Color;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnPlayerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
            Player player = event.getPlayer();

            player.sendMessage(Color.add("&6 Welcome to Anarchy! &fwhere teams are formed, empires build and bases raided. " +
                    "In this ever-changing world you are free to do whatever your heart desires."));
            player.sendMessage(Color.add(""));
            player.sendMessage(Color.add("&f The only rule we follow is &cNO HACKED CLIENTS&f. This will get you banned."));
    }
}
