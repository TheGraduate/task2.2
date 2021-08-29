fun main() {
    val likes = readLine()
    if (likes != null) {
        val likesInt = likes.toInt()
        if (likesInt % 10 === 1 && likesInt != 11) {
            println("Понравилось $likesInt человеку")
        } else if(likesInt % 100 === 11 || likesInt === 11) {
            println("Понравилось $likesInt людям")
        } else {
            println("Понравилось $likesInt людям")
        }
    }
}