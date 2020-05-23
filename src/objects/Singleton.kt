package objects

import java.time.Year

object CompanyRights {
    val currentYear = Year.now().value

    fun getTagLine() = "Computer S.R.C Company"
    fun getCopyrightLine() = "Copyright \u00A9$currentYear Our Company. All rights reserved"
}

fun main() {
    println(CompanyRights.getTagLine())
    println(CompanyRights.getCopyrightLine())
}