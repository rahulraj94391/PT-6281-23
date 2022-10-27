private fun String.isCorrectNameFormat(): Boolean {
    if (this.length > 20) return false
    for (cc in this) {
        if (!(cc.isLetter() || cc == ' ')) {
            return false
        }
    }
    return true
}


fun main() {
    println("Rahul AR".isCorrectNameFormat())
}