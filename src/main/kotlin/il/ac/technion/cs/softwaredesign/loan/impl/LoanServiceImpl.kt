package il.ac.technion.cs.softwaredesign.loan.impl

import il.ac.technion.cs.softwaredesign.loan.LoanService
import java.util.concurrent.CompletableFuture

class LoanServiceImpl : LoanService {

    override fun loanBook(id: String): CompletableFuture<Unit> = throw NotImplementedError()

    override fun returnBook(id: String): CompletableFuture<Unit> = throw NotImplementedError()
}