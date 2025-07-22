package me.Unholyqueen.aDMIN;

import me.Unholyqueen.aDMIN.Commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class Admin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("god").setExecutor(new GodCommand());
        getCommand("vanish").setExecutor(new VanishCommand());
        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("tp").setExecutor(new TpCommand());
        getCommand("Gamemode").setExecutor(new GamemodeCommand());
        getCommand("gamemode").setTabCompleter(new GamemodeCommand());




    }

    @Override
    public void onDisable() {}
    // Plugin shutdown logic

}
