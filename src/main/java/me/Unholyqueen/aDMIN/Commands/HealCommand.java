package me.Unholyqueen.aDMIN.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player p) {
            p.setHealth(20.0); // Heal the player to full health
            p.sendMessage("§aYou have been healed!");
            return true;
        } else {
            sender.sendMessage("§cOnly a player can run this command.");
            return true; // Still return true even if it's just a message
        }
    }
}
