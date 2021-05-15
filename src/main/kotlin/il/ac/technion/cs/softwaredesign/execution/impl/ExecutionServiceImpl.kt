package il.ac.technion.cs.softwaredesign.execution.impl

import il.ac.technion.cs.softwaredesign.execution.ExecutionService
import il.ac.technion.cs.softwaredesign.execution.GeneralResource

class ExecutionServiceImpl : ExecutionService {
    override fun allocateResource(id: String): GeneralResource = throw NotImplementedError()

    override fun releaseResource(resource: GeneralResource) = throw NotImplementedError()
}