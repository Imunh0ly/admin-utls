package me.Unholyqueen.aDMIN.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player p) {


            if (p.getAllowFlight()) {
                p.setAllowFlight(false);
                p.setFlying(false);
                p.sendMessage(ChatColor.RED + "You can no longer fly!");
            } else {
                p.setAllowFlight(true);
                p.setFlying(true);
                p.sendMessage(ChatColor.GREEN + "You can now fly!");
            }
            return true;
        } else {
            sender.sendMessage("Only players can use this command.");
            return true;
        }
    }
}
