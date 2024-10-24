package fr.sachabijmon.getitemid;

import fr.sachabijmon.getitemid.cmd.GetIdCmd;
import org.bukkit.plugin.java.JavaPlugin;

public class GetItemId extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("get-id").setExecutor(new GetIdCmd(this));

        getLogger().info("Plugin démarré.");
    }
}
