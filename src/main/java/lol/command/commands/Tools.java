package lol.command.commands;

import com.jagrosh.jdautilities.command.Command;
import lol.command.ICommand;
import net.dv8tion.jda.api.entities.TextChannel;

public class Tools {
    public static void wrongUsage(TextChannel tc, ICommand c) {
        tc.sendMessage("Wrong Command Usage!\n" + c.getHelp()).queue();
    }
}
