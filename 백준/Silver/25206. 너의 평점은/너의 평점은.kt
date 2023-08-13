fun main() {
    var totalCredit = 0.0
    var totalGrade = 0.0

    repeat(20) {
        val (subject, credit, grade) = readln().split(" ")
        if (grade != "P") totalCredit += credit.toDouble()

        totalGrade += when (grade) {
            "A+" -> credit.toDouble() * 4.5
            "A0" -> credit.toDouble() * 4.0
            "B+" -> credit.toDouble() * 3.5
            "B0" -> credit.toDouble() * 3.0
            "C+" -> credit.toDouble() * 2.5
            "C0" -> credit.toDouble() * 2.0
            "D+" -> credit.toDouble() * 1.5
            "D0" -> credit.toDouble() * 1.0
            else -> credit.toDouble() * 0.0
        }
    }

    println(totalGrade / totalCredit)
}