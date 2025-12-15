package care.cuddliness.stacy.command.commands.example;

import care.cuddliness.stacy.command.annotation.BaseCommandComponent;
import care.cuddliness.stacy.command.data.BaseCommandInterface;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import org.jetbrains.annotations.NotNull;

@BaseCommandComponent(name = "test")
public class TestCommand implements BaseCommandInterface {
    @Override
    public void onExecute(@NotNull Member sender, @NotNull SlashCommandInteractionEvent event) {
        //Replying on the event with a test message
        event.reply("Hello moto!").queue();
    }
}
