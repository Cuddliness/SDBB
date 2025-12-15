package care.cuddliness.stacy.autoconfig;

import care.cuddliness.stacy.command.BaseCommandHandler;
import lombok.RequiredArgsConstructor;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Guild;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@RequiredArgsConstructor
public class DiscordCommandAutoConfiguration {
    private final ApplicationContext applicationContext;
    private final JDA jda;

    @Bean
    @ConditionalOnMissingBean
    public BaseCommandHandler discordCommandBackend() {
        Guild guild = this.jda.getGuildById(-1L);
        return new BaseCommandHandler(this.applicationContext, this.jda, guild);
    }

}
