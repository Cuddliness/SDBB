package care.cuddliness.stacy.command;

import care.cuddliness.stacy.command.annotation.BaseCommandOption;
import care.cuddliness.stacy.command.data.BaseSubCommandInterface;

import java.util.List;

public record BaseSubCommand(BaseSubCommandInterface command, String subCommandId, String SubCommandGroup,
                             List<BaseCommandOption> options) {

}
