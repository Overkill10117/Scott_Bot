package lol.command.commands;

import lol.command.CommandContext;
import lol.command.ICommand;
import me.duncte123.botcommons.messaging.EmbedUtils;
import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class BoredCommand implements ICommand {
    @Override
    public void handle(CommandContext ctx) {
        final EmbedBuilder embed = EmbedUtils.defaultEmbed()
                .setDescription("BORED? go to https://discord.com/ or go type $help for some commands....")
                .setColor(Color.cyan)
                .setTitle("BORED")
                .setFooter("NOT BORED ANYMORE...");
        ctx.getChannel().sendMessage(embed.build()).queue();
    }

    @Override
    public String getName() {
        return "bored";
    }

    @Override
    public String getHelp() {
        return "if your bored";
    }
}
