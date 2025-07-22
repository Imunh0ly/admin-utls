package me.Unholyqueen.aDMIN.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TpCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player p) {
            if (args.length == 3) {
                try {
                    double x = Double.parseDouble(args[0]);
                    double y = Double.parseDouble(args[1]);
                    double z = Double.parseDouble(args[2]);
                    Location loc = new Location(p.getWorld(), x, y, z);
                    p.teleport(loc);
                    p.sendMessage(ChatColor.GREEN + "Teleported to coordinates: " + x + ", " + y + ", " + z);
                } catch (NumberFormatException e) {
                    p.sendMessage(ChatColor.RED + "Invalid coordinates. Please use numbers.");
                }
            } else if (args.length == 1) {
                Player target = p.getServer().getPlayer(args[0]);
                if (target != null) {
                    p.teleport(target.getLocation());
                    p.sendMessage(ChatColor.GREEN + "Teleported to player: " + target.getName());
                } else {
                    p.sendMessage(ChatColor.RED + "Player not found: " + args[0]);
                }
            } else {
                p.sendMessage(ChatColor.RED + "Usage: /tp <x> <y> <z> or /tp <player>");
            }
            return true;
        }
        return true;
    }
}
