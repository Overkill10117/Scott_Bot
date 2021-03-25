package lol.command.commands;

import com.jagrosh.jdautilities.commons.utils.FinderUtil;
import gnu.trove.impl.Constants;
import lol.command.CommandContext;
import lol.command.ICommand;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.TextChannel;

import java.util.Arrays;
import java.util.List;

public class pollcommand implements ICommand {
    @Override
    public void handle(CommandContext ctx) {
        String msg = ctx.getEvent().getMessage().getContentRaw();
        if(!ctx.getArgs().isEmpty()) {
            List<String> pollArgs = Arrays.asList(msg.split("\\s+", 2)[1].split(","));
            if(pollArgs.size()>20) {
                ctx.getEvent().getChannel().sendMessage("Exceeded the maximum amount of options available in the poll command!").queue();
                return;
            }
            String[] unicodeEmoji = {"\uD83C\uDDE6", "\uD83C\uDDE7", "\uD83C\uDDE8", "\uD83C\uDDE9", "\uD83C\uDDEA", "\uD83C\uDDEB", "\uD83C\uDDEC", "\uD83C\uDDED", "\uD83C\uDDEE", "\uD83C\uDDEF", "\uD83C\uDDF0", "\uD83C\uDDF1", "\uD83C\uDDF2", "\uD83C\uDDF3", "\uD83C\uDDF4", "\uD83C\uDDF5", "\uD83C\uDDF6", "\uD83C\uDDF7", "\uD83C\uDDF8", "\uD83C\uDDF9", "\uD83C\uDDFA", "\uD83C\uDDFB", "\uD83C\uDDFC", "\uD83C\uDDFD", "\uD83C\uDDFE", "\uD83C\uDDFF"};
            String[] emoji = {":regional_indicator_a:", ":regional_indicator_b:", ":regional_indicator_c:", ":regional_indicator_d:", ":regional_indicator_e:", ":regional_indicator_f:", ":regional_indicator_g:", ":regional_indicator_h:", ":regional_indicator_i:", ":regional_indicator_j:", ":regional_indicator_k:", ":regional_indicator_l:", ":regional_indicator_m:", ":regional_indicator_n:", ":regional_indicator_o:", ":regional_indicator_p:", ":regional_indicator_q:", ":regional_indicator_r:", ":regional_indicator_s:", ":regional_indicator_t:", ":regional_indicator_u:", ":regional_indicator_v:", ":regional_indicator_w:", ":regional_indicator_x:", ":regional_indicator_y:", ":regional_indicator_z:"};
            int counter = pollArgs.size();
            EmbedBuilder poll = new EmbedBuilder()
                    .setTitle("Poll")
                    .setFooter("React to this poll with the emoji corresponding to each option.");
            for(int i=0; i<counter; i++) {
                poll.appendDescription(emoji[i] + ": **" + pollArgs.get(i).trim() + "**\n");
            }
            ctx.getEvent().getChannel().sendMessage(poll.build()).queue(reactPoll -> {
                for(int i=0; i<counter; i++) {
                    reactPoll.addReaction(unicodeEmoji[i]).queue();
                }
            });
        } else {
            Tools.wrongUsage(ctx.getEvent().getChannel(), this);
        }
    }

    @Override
    public String getName() {
        return "poll";
    }

    @Override
    public String getHelp() {
        return "Starts a poll for the every user in the server who can read the poll!\n" +
                "`" + " <each option separated by a tilde(,)>";
    }
}
