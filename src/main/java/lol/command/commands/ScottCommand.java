package lol.command.commands;

import lol.Listener;
import lol.command.CommandContext;
import lol.command.ICommand;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.time.Instant;
import java.util.List;
import java.util.Random;

public class ScottCommand implements ICommand {
    public final static String GUILD_ONLINE = "<:online:313956277808005120>";
    public final static String GUILD_IDLE = "<:away:313956277220802560>";
    public final static String GUILD_DND = "<:dnd:313956276893646850>";
    public final static String GUILD_OFFLINE = "<:offline:313956277237710868>";
    public final static String GUILD_STREAMING = "<:streaming:313956277132853248>";

    public final static String CHECK = "<:check:314349398811475968>";
    public final static String UNCHECK = "<:xmark:314349398824058880>";
    public final static String NOCHECK = "<:empty:314349398723264512>";

    private static final Logger LOGGER = LoggerFactory.getLogger(Listener.class);
    @Override
    public void handle(CommandContext ctx) {
            EmbedBuilder embed = new EmbedBuilder()
                    .setTitle("Scott")
                    .setAuthor("Unknown", "https://images-ext-2.discordapp.net/external/B_9WyBOhrS_-KlpDE_JBzImk9EdmpCyZBzaIl7h6odE/https/cdn.discordapp.com/avatars/769178417463427082/c91a78868220ab1df5735ae967d7dded.png")
                    .setColor(randomColor()).setThumbnail("https://images-ext-2.discordapp.net/external/B_9WyBOhrS_-KlpDE_JBzImk9EdmpCyZBzaIl7h6odE/https/cdn.discordapp.com/avatars/769178417463427082/c91a78868220ab1df5735ae967d7dded.png").setTimestamp(Instant.now())
                    .setFooter("Scott Info...", null);

            embed.addField("Identity", "ID "+"`769178417463427082`"+
                    "\n", true);

            embed.addField("Discrim:", "`4548`"+"\n", true);

            embed.addField("Status", "🎮 "+" `"+"`\n"+
                    " Offline`"+"`\n", true);

            embed.addField("Age", "`13`", true);

            embed.addField("love life stats", "`single`", true);

            embed.addField("Gender", "`Male?`", true);

            ctx.getEvent().getChannel().sendMessage(embed.build()).queue();
        }

    @Override
    public String getName() {
        return "scott";
    }

    @Override
    public String getHelp() {
        return "Get info about the specified user\n" +
                "`scott`";
    }


    public static String getStatusEmoji(OnlineStatus stat)
    {
        String status = "";
        switch (stat) {
            case ONLINE:
                status = GUILD_ONLINE;
                break;
            case IDLE:
                status = GUILD_IDLE;
                break;
            case DO_NOT_DISTURB:
                status = GUILD_DND;
                break;
            case INVISIBLE:
                status = GUILD_OFFLINE;
                break;
            case OFFLINE:
                status = GUILD_OFFLINE;
                break;
            default:
                status = GUILD_OFFLINE;
        }
        return status;
    }

    public static Color randomColor() {
        Random colorpicker = new Random();
        int red = colorpicker.nextInt(255) + 1;
        int green = colorpicker.nextInt(255) + 1;
        int blue = colorpicker.nextInt(255) + 1;
        return new Color(red, green, blue);
    }
}
