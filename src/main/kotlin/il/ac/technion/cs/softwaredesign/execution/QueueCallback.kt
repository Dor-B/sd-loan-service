package il.ac.technion.cs.softwaredesign.execution

/**
 * A callback which represents a queue-able job in the system.
 */
interface QueueCallback {
    /**
     * Fired when this job is allocated resources in the system and starts running. The
     * [resources] list includes [GeneralResource]s which were allocated for this job.
     */
    fun onResourcesAllocated(resources: List<GeneralResource>)
}