package fr.sachabijmon.getitemid.cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GetIdCmd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;

            player.sendMessage(String.valueOf(player.getInventory().getItemInMainHand().getType()));
        }

        return false;
    }
}
