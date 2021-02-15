package lol.command.commands;

import lol.command.CommandContext;
import lol.command.ICommand;

public class triviaCommand implements ICommand {
    @Override
    public void handle(CommandContext ctx) {
        ctx.getChannel().sendMessage("scott loves calling his brother and enemies 'gay' ").queue();
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
