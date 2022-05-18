package il.ac.technion.cs.softwaredesign.execution


/**
 * A general approval for loaning a book, used for obtained loans.
 */
interface GeneralBookLoanApproval {
    val name: String
    val id: String
}

interface RegularBookLoanApproval: GeneralBookLoanApproval {
    /**
     * The permission code which can be used to physically take the book
     */
    val permissionCode: String
}

interface FacultyStaffBookLoanApproval: GeneralBookLoanApproval {
    /**
     * @return the permission code or null if the staff secret is wrong
     */
    fun permissionCode(staffSecret: String): String?
}