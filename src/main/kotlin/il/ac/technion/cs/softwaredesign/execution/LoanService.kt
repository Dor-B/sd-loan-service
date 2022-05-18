@file:Suppress("unused", "UNUSED_PARAMETER")
package il.ac.technion.cs.softwaredesign.execution

import java.util.concurrent.CompletableFuture


interface LoanService {
    /**
     * Verifies the existence of the given book [id], returning it's type (without actually loaning it).
     *
     * @throws IllegalArgumentException If this book does not exist in the library
     */
    fun verifyBook(id: String): CompletableFuture<Class<out GeneralBookLoanApproval>>

    /**
     * Marks a single book as loaned in the library (so now there are -1 available books with this id),
     * and returns an approval for a loan which the user can use to physically get the book in the library.
     *
     * @throws IllegalArgumentException If the book is already loaned or does not exist.
     */
    fun loanBook(id: String): CompletableFuture<GeneralBookLoanApproval>

    /**
     * Makes the single book available again (so now there are +1 available books with this id)
     */
    fun returnBook(bookLoanApproval: GeneralBookLoanApproval): CompletableFuture<Unit>
}