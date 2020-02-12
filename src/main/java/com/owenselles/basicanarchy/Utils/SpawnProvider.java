package com.owenselles.basicanarchy.Utils;

import com.owenselles.basicanarchy.BasicAnarchy;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class SpawnProvider {

    private static World w = BasicAnarchy.getPlugin(BasicAnarchy.class).getServer().getWorld("world");

    public Location getSpawn(Player p) {

        // min - max spawn range
        int x = RandomNumberProvider.getRandomNumberInRange(-75, 75);
        int z = RandomNumberProvider.getRandomNumberInRange(-75, 75);
        int y = w.getHighestBlockYAt(x, z);

        Location l = new Location(w, x, y, z);

        boolean invalid = false;

        // if player has active bed location spawn there
        if (p.getBedSpawnLocation() != null) {
            return p.getBedSpawnLocation();
        }

        //check if the location is too close to zero
        if ((x > -15 && x < 15) || (z > -15 && z < 15)) {
            invalid = true;
        }

        //check if the spawn location is on top of liquid
        if (w.getBlockAt(x, y, z).isLiquid() || w.getBlockAt(x, y - 1, z).isLiquid()) {
            invalid = true;
        }

        //if all checks are passed spawn the player
        if (invalid) {
            return this.getSpawn(p);
        } else {
            return l;
        }

    }
}
