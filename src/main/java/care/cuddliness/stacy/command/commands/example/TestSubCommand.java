package care.cuddliness.stacy.command.commands.example;

import care.cuddliness.stacy.command.annotation.BaseSubCommandComponent;
import care.cuddliness.stacy.command.data.BaseSubCommandInterface;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import org.jetbrains.annotations.NotNull;

@BaseSubCommandComponent(subCommandId = "ping", subCommandGroupid = "tools", parent = TestCommand.class)
public class TestSubCommand implements BaseSubCommandInterface {
    @Override
    public void onExecute(@NotNull Member sender, @NotNull SlashCommandInteractionEvent event) {
        event.reply("pong!").queue();
    }
}
