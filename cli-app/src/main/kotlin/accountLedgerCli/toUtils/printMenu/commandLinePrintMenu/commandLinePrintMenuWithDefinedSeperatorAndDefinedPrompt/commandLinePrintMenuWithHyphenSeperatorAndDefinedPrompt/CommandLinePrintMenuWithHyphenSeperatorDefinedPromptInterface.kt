package accountLedgerCli.toUtils.printMenu.commandLinePrintMenu.commandLinePrintMenuWithDefinedSeperatorAndDefinedPrompt.commandLinePrintMenuWithHyphenSeperatorAndDefinedPrompt

import accountLedgerCli.toUtils.printMenu.commandLinePrintMenu.commandLinePrintMenuWithDefinedSeperatorAndDefinedPrompt.CommandLinePrintMenuWithDefinedSeperatorDefinedPromptInterface
import accountLedgerCli.toUtils.printMenu.commandLinePrintMenu.prompt.HyphenSeperatorInterface

public interface CommandLinePrintMenuWithHyphenSeperatorDefinedPromptInterface: CommandLinePrintMenuWithDefinedSeperatorDefinedPromptInterface, HyphenSeperatorInterface {
    override val titleSeperator: Char
        get() = titleSeperator
}