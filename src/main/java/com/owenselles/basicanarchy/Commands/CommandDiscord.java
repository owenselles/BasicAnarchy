package com.owenselles.basicanarchy.Commands;

import com.owenselles.basicanarchy.Utils.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandDiscord implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            player.sendMessage(Color.add("&9Discord server: https://discord.gg/p2TQZ4t"));
            return true;
        }
        return false;
    }
}