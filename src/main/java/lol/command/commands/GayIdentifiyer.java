package lol.command.commands;

import lol.Config;
import lol.command.CommandContext;
import lol.command.ICommand;
import me.duncte123.botcommons.messaging.EmbedUtils;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.TextChannel;

import java.awt.*;

public class GayIdentifiyer implements ICommand {
    @Override
    public void handle(CommandContext ctx) {
        if (ctx.getMember().isOwner()){
            final EmbedBuilder embe = EmbedUtils.defaultEmbed()
                    .setDescription("YOU ARE MALE HAHAHAHAHAHA")
                    .setTitle("GAY IDENTIFIER")
                    .setFooter("lol 100% true")
                    .setColor(Color.green)
                    .setImage("https://images-ext-2.discordapp.net/external/phq2HA3yZ2Hs9Kb8FLxn-gR9-qf6p0LiHWzw9EnML04/https/pm1.narvii.com/6679/be8bb5c184ec060047b6bbb111327afcd69a1d43_hq.jpg?width=994&height=559");
            ctx.getChannel().sendMessage(embe.build()).queue();
            return;
        }
        double meh = Math.random()*10;

        switch ((int) meh) {
            case 1:
                final TextChannel channel = ctx.getChannel();
                final EmbedBuilder embed = EmbedUtils.defaultEmbed()
                        .setDescription("YOU ARE VERY GAY HAHAHAHAHAHA")
                        .setTitle("GAY IDENTIFIER")
                        .setFooter("lol 100% true")
                        .setColor(Color.blue)
                        .setImage("https://images-ext-2.discordapp.net/external/phq2HA3yZ2Hs9Kb8FLxn-gR9-qf6p0LiHWzw9EnML04/https/pm1.narvii.com/6679/be8bb5c184ec060047b6bbb111327afcd69a1d43_hq.jpg?width=994&height=559");
                channel.sendMessage(embed.build()).queue();
                return;
            case 2:
                final EmbedBuilder embeded = EmbedUtils.defaultEmbed()
                        .setDescription("YOU ARE NOT SO GAY HAHAHAHAHAHA")
                        .setTitle("GAY IDENTIFIER")
                        .setFooter("lol 100% true")
                        .setColor(Color.yellow)
                        .setImage("https://images-ext-2.discordapp.net/external/phq2HA3yZ2Hs9Kb8FLxn-gR9-qf6p0LiHWzw9EnML04/https/pm1.narvii.com/6679/be8bb5c184ec060047b6bbb111327afcd69a1d43_hq.jpg?width=994&height=559");
                ctx.getChannel().sendMessage(embeded.build()).queue();
                return;
            case 3:
                final EmbedBuilder embededed = EmbedUtils.defaultEmbed()
                        .setDescription("YOU ARE NOT GAY BUT FEMALE HAHAHAHAHAHA")
                        .setTitle("GAY IDENTIFIER")
                        .setFooter("lol 100% true")
                        .setColor(Color.red)
                        .setImage("https://images-ext-2.discordapp.net/external/phq2HA3yZ2Hs9Kb8FLxn-gR9-qf6p0LiHWzw9EnML04/https/pm1.narvii.com/6679/be8bb5c184ec060047b6bbb111327afcd69a1d43_hq.jpg?width=994&height=559");
                ctx.getChannel().sendMessage(embededed.build()).queue();
                return;
            case 4:
                final EmbedBuilder embe = EmbedUtils.defaultEmbed()
                        .setDescription("YOU ARE MALE HAHAHAHAHAHA")
                        .setTitle("GAY IDENTIFIER")
                        .setFooter("lol 100% true")
                        .setColor(Color.green)
                        .setImage("https://images-ext-2.discordapp.net/external/phq2HA3yZ2Hs9Kb8FLxn-gR9-qf6p0LiHWzw9EnML04/https/pm1.narvii.com/6679/be8bb5c184ec060047b6bbb111327afcd69a1d43_hq.jpg?width=994&height=559");
                ctx.getChannel().sendMessage(embe.build()).queue();
                return;
            case 5:
                final EmbedBuilder embedededed = EmbedUtils.defaultEmbed()
                        .setDescription("YOU ARE 50% GAY HAHAHAHAHAHA")
                        .setTitle("GAY IDENTIFIER")
                        .setFooter("lol 100% true")
                        .setColor(Color.orange)
                        .setImage("https://images-ext-2.discordapp.net/external/phq2HA3yZ2Hs9Kb8FLxn-gR9-qf6p0LiHWzw9EnML04/https/pm1.narvii.com/6679/be8bb5c184ec060047b6bbb111327afcd69a1d43_hq.jpg?width=994&height=559");
                ctx.getChannel().sendMessage(embedededed.build()).queue();
                return;
            case 6:
                final EmbedBuilder emm = EmbedUtils.defaultEmbed()
                .setDescription("`It is unknown the identifier can't identify you!!!`")
                    .setTitle("GAY IDENTIFIER")
                    .setFooter("lol 100% true")
                    .setColor(Color.orange);
                ctx.getChannel().sendMessage(emm.build()).queue();
                return;
            default:
                final EmbedBuilder em = EmbedUtils.defaultEmbed()
                        .setDescription("YOU ARE 100% GAY HAHAHAHAHAHA")
                        .setTitle("GAY IDENTIFIER")
                        .setFooter("lol 100% true")
                        .setColor(Color.red)
                        .setImage("https://images-ext-2.discordapp.net/external/phq2HA3yZ2Hs9Kb8FLxn-gR9-qf6p0LiHWzw9EnML04/https/pm1.narvii.com/6679/be8bb5c184ec060047b6bbb111327afcd69a1d43_hq.jpg?width=994&height=559");
                ctx.getChannel().sendMessage(em.build()).queue();
        }
    }

    @Override
    public String getName() {
        return "gi";
    }

    @Override
    public String getHelp() {
        return "gi [question]";
    }
}
