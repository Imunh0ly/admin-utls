package me.Unholyqueen.aDMIN.Commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GamemodeCommand implements CommandExecutor, TabCompleter {

    private final List<String> gamemodes = Arrays.asList("survival", "creative", "adventure", "spectator");

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player p) {
            if (args.length > 0) {
                String mode = args[0].toLowerCase();
                switch (mode) {
                    case "survival":
                        p.setGameMode(GameMode.SURVIVAL);
                        p.sendMessage("§aSwitched to Survival mode.");
                        break;
                    case "creative":
                        p.setGameMode(GameMode.CREATIVE);
                        p.sendMessage("§aSwitched to Creative mode.");
                        break;
                    case "adventure":
                        p.setGameMode(GameMode.ADVENTURE);
                        p.sendMessage("§aSwitched to Adventure mode.");
                        break;
                    case "spectator":
                        p.setGameMode(GameMode.SPECTATOR);
                        p.sendMessage("§aSwitched to Spectator mode.");
                        break;
                    default:
                        p.sendMessage("§cInvalid gamemode. Use: survival, creative, adventure, or spectator.");
                        break;
                }
            } else {
                p.sendMessage("§cPlease specify a gamemode: survival, creative, adventure, or spectator.");
            }
        } else {
            sender.sendMessage("§cOnly players can use this command.");
        }
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (args.length == 1) {
            List<String> completions = new ArrayList<>();
            String input = args[0].toLowerCase();
            for (String gm : gamemodes) {
                if (gm.startsWith(input)) {
                    completions.add(gm);
                }
            }
            return completions;
        }
        return null;
    }
}
