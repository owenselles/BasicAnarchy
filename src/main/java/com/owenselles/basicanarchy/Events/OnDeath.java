package com.owenselles.basicanarchy.Events;

import com.owenselles.basicanarchy.Utils.SpawnProvider;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

public class OnDeath implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onDeath(PlayerRespawnEvent event) {
        if (event.getPlayer().isDead()) {
            event.setRespawnLocation(new SpawnProvider().getSpawn(event.getPlayer()));
        }
    }
}
