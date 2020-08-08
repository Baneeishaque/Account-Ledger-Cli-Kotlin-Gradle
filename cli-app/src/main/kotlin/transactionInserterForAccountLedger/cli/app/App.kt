/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package transactionInserterForAccountLedger.cli.app

import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default

object App {
    const val appName = "Sample CLI App"
    const val version = "0.0.1"
}

fun main(args: Array<String>) {

    val parser = ArgParser("${App.appName}:: ${App.version}")
    val version by parser.option(ArgType.Boolean, shortName = "V", description = "Version").default(false)

    // Add all input to parser
    parser.parse(args)

    if (version) println(App.version)
}
