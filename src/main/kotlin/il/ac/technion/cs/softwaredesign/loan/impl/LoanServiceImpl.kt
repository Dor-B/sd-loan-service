package il.ac.technion.cs.softwaredesign.loan.impl

import il.ac.technion.cs.softwaredesign.loan.LoanService
import il.ac.technion.cs.softwaredesign.loan.GeneralBookLoanApproval
import java.util.concurrent.CompletableFuture

class LoanServiceImpl : LoanService {
    override fun verifyBook(id: String): CompletableFuture<Class<out GeneralBookLoanApproval>> = throw NotImplementedError()

    override fun loanBook(id: String): CompletableFuture<GeneralBookLoanApproval> = throw NotImplementedError()

    override fun returnBook(bookLoanApproval: GeneralBookLoanApproval): CompletableFuture<Unit> = throw NotImplementedError()
}