@file:Suppress("unused", "UNUSED_PARAMETER")
package il.ac.technion.cs.softwaredesign.loan

import java.util.concurrent.CompletableFuture


interface LoanService {

    /**
     * Marks a single book as loaned in the library (for registry)
     *
     */
    fun loanBook(id: String): CompletableFuture<Unit>

    /**
     * Marks the single book as available again (for registry)
     */
    fun returnBook(id: String): CompletableFuture<Unit>
}