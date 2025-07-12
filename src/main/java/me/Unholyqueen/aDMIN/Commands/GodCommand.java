package me.Unholyqueen.aDMIN.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class GodCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        //See if a player ran the command
        if (sender instanceof Player p){

            //Get the Player object to be able to do things
            //See if they are invulnerable (cant be hurt)
            if (p.isInvulnerable()){
                //since they are, disable it and send them a message
                p.setInvulnerable(false);
                p.sendMessage(ChatColor.RED + "God mode disabled.");
            }else{
                p.setInvulnerable(true);
                p.sendMessage(ChatColor.GREEN + "God mode enabled.");
            }

        }else{
            System.out.println("Only a player can run this command");
        }

        return true;
    }
}