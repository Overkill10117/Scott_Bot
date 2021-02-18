package lol.command.commands;

import lol.command.CommandContext;
import lol.command.ICommand;

public class triviaCommand implements ICommand {
    @Override
    public void handle(CommandContext ctx) {
        double meh = Math.random()*10;

        switch ((int) meh) {
            case 1:
                ctx.getChannel().sendMessage("scott loves calling his brother and enemies \"gay\"\n").queue();
                return;
            case 2:
                ctx.getChannel().sendMessage("scott is a human....").queue();
                return;
            case 3:
                ctx.getChannel().sendMessage(" scott is :scream: ing").queue();
                return;
        }
    }

    @Override
    public String getName() {
        return "trivia";
    }

    @Override
    public String getHelp() {
        return "says something......";
    }
}
