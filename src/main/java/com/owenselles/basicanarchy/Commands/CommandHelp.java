package com.owenselles.basicanarchy.Commands;

import com.owenselles.basicanarchy.Utils.ColorProvider;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHelp implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            player.sendMessage(ColorProvider.add("&6/help: &fShows this message."));
            player.sendMessage(ColorProvider.add("&6/msg: &fSend someone a private message."));
            player.sendMessage(ColorProvider.add("&6/suicide: &fKill yourself."));
            player.sendMessage(ColorProvider.add("&6/discord: &fGet the Discord invite link"));
            player.sendMessage(ColorProvider.add("&6/plugins: &fShows the server plugins"));
            return true;
        }
        return false;
    }
}