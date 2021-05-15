package il.ac.technion.cs.softwaredesign.execution.impl

import il.ac.technion.cs.softwaredesign.execution.ExecutionService
import il.ac.technion.cs.softwaredesign.execution.GeneralResource
import java.util.concurrent.CompletableFuture

class ExecutionServiceImpl : ExecutionService {
    override fun allocateResource(id: String): CompletableFuture<GeneralResource> = throw NotImplementedError()

    override fun releaseResource(resource: GeneralResource): CompletableFuture<Unit> = throw NotImplementedError()
}