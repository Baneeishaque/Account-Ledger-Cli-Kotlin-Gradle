package accountLedgerCli.toUtils.printMenu.commandLinePrintMenu.commandLinePrintMenuWithDefinedSeperatorAndDefinedPrompt.commandLinePrintMenuWithHyphenSeperatorAndDefinedPrompt.commandLinePrintMenuWithHyphenSeperatorDefinedPromptAndDefinedTitle

import accountLedgerCli.toUtils.printMenu.commandLinePrintMenu.prompt.ContinuePromptInterface

public interface CommandLinePrintMenuWithHyphenSeperatorContinuePromptAndDefinedTitleInterface: CommandLinePrintMenuWithHyphenSeperatorDefinedPromptAndDefinedTitleInterface, ContinuePromptInterface {
    override val promptWord: String
        get() = promptWord
}