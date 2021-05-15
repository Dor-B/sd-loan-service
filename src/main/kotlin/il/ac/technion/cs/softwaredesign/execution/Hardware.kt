package il.ac.technion.cs.softwaredesign.execution


/**
 * A general resource description, used to allocate for queued jobs. Such resources include:
 *
 * * [CPUResource] – A Central Processing Unit capable of invoking generic functions.
 * * [GPUResource] – A Graphical Processing Unit capable of fast vector arithmetic.
 */
interface GeneralResource {
    val name: String
    val id: String
}

interface CPUResource: GeneralResource {
    /**
     * Invoke a function on this CPU. This method grabs the return value of the supplied function and
     * returns it.
     */
    fun <T> invoke(function: () -> T): T
}

interface GPUResource: GeneralResource {
    /**
     * Perform element-wise vector-addition, returning a result vector of the same size. Vectors [a] and [b]
     * must be of the same size
     * @throws IllegalArgumentException If [a] and [b] differ in size
     * @return A new vector c where c(i) = a(i) + b(i) for all i
     */
    fun add(a: Array<Number>, b: Array<Number>): Array<Number>

    /**
     * Perform element-wise vector multiplication, returning a result vector of the same size. Vectors [a] and [b]
     * must be of the same size
     * @throws IllegalArgumentException If [a] and [b] differ in size
     * @return A new vector c where c(i) = a(i) * b(i) for all i
     */
    fun multiply(a: Array<Number>, b: Array<Number>): Array<Number>
}
