package lol;

import com.jagrosh.jdautilities.commons.waiter.EventWaiter;
import me.duncte123.botcommons.messaging.EmbedUtils;
import me.duncte123.botcommons.web.WebUtils;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.cache.CacheFlag;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;

public class Bot {

    private Bot() throws LoginException {
        WebUtils.setUserAgent("I am a bot");
        EmbedUtils.setEmbedBuilder(
                () -> new EmbedBuilder()
                        .setColor(0x0062ff)
                        .setFooter("lol")
        );

        EventWaiter waiter = new EventWaiter();

        JDABuilder.createDefault(
                System.get("token")
               
        )
                .disableCache(EnumSet.of(
                        CacheFlag.CLIENT_STATUS,
                        CacheFlag.ACTIVITY,
                        CacheFlag.EMOTE
                ))
                .enableCache(CacheFlag.VOICE_STATE)
                .addEventListeners(new Listener(waiter), waiter)
                .setActivity(Activity.watching("hello"))
                .build();
    }

    public static void main(String[] args) throws LoginException {
        new Bot();
    }
}

