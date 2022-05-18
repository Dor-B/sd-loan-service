package il.ac.technion.cs.softwaredesign.execution.impl

import il.ac.technion.cs.softwaredesign.execution.LoanService
import il.ac.technion.cs.softwaredesign.execution.GeneralBookLoanApproval
import java.util.concurrent.CompletableFuture

class LoanServiceImpl : LoanService {
    override fun verifyBook(id: String): CompletableFuture<Class<out GeneralBookLoanApproval>> = throw NotImplementedError()

    override fun loanBook(id: String): CompletableFuture<GeneralBookLoanApproval> = throw NotImplementedError()

    override fun returnBook(bookLoanApproval: GeneralBookLoanApproval): CompletableFuture<Unit> = throw NotImplementedError()
}