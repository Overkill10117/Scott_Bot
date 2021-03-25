package lol.command.commands;

import lol.command.CommandContext;
import lol.command.ICommand;

import java.util.concurrent.TimeUnit;

public class HelloCommand implements ICommand {
    @Override
    public void handle(CommandContext ctx) {
        ctx.getChannel().sendMessage("hello").queue();
        return;
    }

    @Override
    public String getName() {
        return "hi";
    }

    @Override
    public String getHelp() {
        return "says hello";
    }
}
