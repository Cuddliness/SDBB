package care.cuddliness.base.command;

import care.cuddliness.base.command.annotation.BaseCommandOption;
import care.cuddliness.base.command.data.BaseSubCommandInterface;

import java.util.List;

public record BaseSubCommand(BaseSubCommandInterface command, String subCommandId, String SubCommandGroup,
                             List<BaseCommandOption> options) {

}
