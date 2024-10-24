package fr.sachabijmon.getitemid.cmd;

import fr.sachabijmon.getitemid.GetItemId;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GetIdCmd implements CommandExecutor {
    private final GetItemId main;

    public GetIdCmd(GetItemId main) {  this.main = main;  }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player) sender;

            player.sendMessage(String.valueOf(player.getInventory().getItemInMainHand().getType()));
        }

        return false;
    }
}
