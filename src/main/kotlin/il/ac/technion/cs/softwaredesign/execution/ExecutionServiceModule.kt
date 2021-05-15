package il.ac.technion.cs.softwaredesign.execution

import dev.misfitlabs.kotlinguice4.KotlinModule
import il.ac.technion.cs.softwaredesign.execution.impl.ExecutionServiceImpl

class ExecutionServiceModule : KotlinModule() {
    override fun configure() {
        bind<ExecutionService>().to<ExecutionServiceImpl>()
    }
}