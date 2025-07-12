package me.Unholyqueen.aDMIN.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (sender instanceof Player p) {
            // Set the player's food level to full (20) and saturation to full (20)
            p.setFoodLevel(20);
            p.setSaturation(20);
            p.sendMessage(ChatColor.GREEN + "You have been fed!");
            return true;
        } else {
            sender.sendMessage(ChatColor.RED + "Only players can use this command!");
            return true;
        }
    }
}