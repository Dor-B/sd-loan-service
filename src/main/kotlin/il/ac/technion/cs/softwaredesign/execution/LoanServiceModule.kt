package il.ac.technion.cs.softwaredesign.execution

import dev.misfitlabs.kotlinguice4.KotlinModule
import il.ac.technion.cs.softwaredesign.execution.impl.LoanServiceImpl

class LoanServiceModule : KotlinModule() {
    override fun configure() {
        bind<LoanService>().to<LoanServiceImpl>()
    }
}