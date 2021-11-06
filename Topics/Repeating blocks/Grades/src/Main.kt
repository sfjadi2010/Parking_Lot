const val A_GRADE: Int = 5
const val B_GRADE: Int = 4
const val C_GRADE: Int = 3
const val D_GRADE: Int = 2

fun main() {
    // put your code here
    val students: Int = readLine()!!.toInt()
    var a: Int = 0
    var b: Int = 0
    var c: Int = 0
    var d: Int = 0

    repeat(students) {
        val grade: Int = readLine()!!.toInt()

        if (grade == A_GRADE) {
            a += 1
        } else if (grade == B_GRADE) {
            b += 1
        } else if (grade == C_GRADE) {
            c += 1
        } else if (grade == D_GRADE) {
            d += 1
        }
    }
    println("$d $c $b $a")
}