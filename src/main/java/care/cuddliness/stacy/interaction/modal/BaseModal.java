package care.cuddliness.stacy.interaction.modal;

import care.cuddliness.stacy.interaction.modal.annotation.ModalInput;
import care.cuddliness.stacy.interaction.modal.data.ModalExecutorInterface;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public record BaseModal(@NotNull ModalExecutorInterface modalExecutorInterface, List<ModalInput> options,
                        @NotNull String name) {

}
