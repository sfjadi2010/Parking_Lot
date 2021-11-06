import java.text.SimpleDateFormat

const val INPUTDATE: String = "yyyy-MM-dd"
const val OUTPUTDATE: String = "MM/dd/yyyy"

fun main() {
    // write your code here
    print(SimpleDateFormat(OUTPUTDATE).format(SimpleDateFormat(INPUTDATE).parse(readLine()!!.toString())))
}