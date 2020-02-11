package com.owenselles.basicanarchy.Events;

import com.owenselles.basicanarchy.Utils.ColorProvider;
import com.owenselles.basicanarchy.Utils.SpawnProvider;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnPlayerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        player.sendMessage(ColorProvider.add("&6 Welcome to Anarchy! &fwhere teams are formed, empires built and bases raided. " +
                "In this ever-changing world you are free to do whatever your heart desires."));
        player.sendMessage(ColorProvider.add(""));
        player.sendMessage(ColorProvider.add("&f The only rule we follow is &cNO HACKED CLIENTS&f. This can get you banned."));

        if (!event.getPlayer().hasPlayedBefore()) {
            event.getPlayer().teleport(new SpawnProvider().getSpawn(event.getPlayer()));
        }

    }
}
