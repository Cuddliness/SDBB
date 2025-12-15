package care.cuddliness.base.interaction.button;

import care.cuddliness.base.interaction.button.data.ButtonExecutorInterface;
import org.jetbrains.annotations.NotNull;

public record BaseButton(@NotNull ButtonExecutorInterface buttonExecutorInterface, @NotNull String name) {


}
