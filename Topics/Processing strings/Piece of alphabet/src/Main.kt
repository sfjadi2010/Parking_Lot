fun main() {
    // write your code here
    val sentance: CharArray = readLine()!!.toCharArray()
    var result: String = "false"

    for (indx in 0 until sentance.lastIndex) {
        for (jndx in indx until sentance.lastIndex) {
            if (sentance[jndx].toInt() + 1 == sentance[jndx+1].toInt()) {
                result = "true"
            } else {
                result = "false"
            }
        }
    }

    print(result)
}