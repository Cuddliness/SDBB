package care.cuddliness.base.interaction.button.buttons;

import care.cuddliness.base.interaction.button.annotation.BaseButtonComponent;
import care.cuddliness.base.interaction.button.data.ButtonExecutorInterface;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.interactions.components.buttons.ButtonStyle;

@BaseButtonComponent(name = "test", style = ButtonStyle.SUCCESS)

public class TesButton implements ButtonExecutorInterface {


    // Executes when button with the id 'test' is pressed
    public void onExecute(Member clicker, ButtonInteractionEvent event) {
        event.reply("You clicked a button!").queue();

    }
}
