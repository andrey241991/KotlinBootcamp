package lesson2

class Strings {

    fun showString() {
        val trout = "trout"
        var haddock = "haddock"
        var snapper = "snapper"
        println("I like to eat $trout and $snapper, but not a big fan of $haddock.")
    }

    fun showDiffString(fishName: String) {
        when (fishName.length) {
            0 -> println("Fish name cannot be empty")
            in 3..12 -> println("Good fish name")
            else -> println("OK fish name")
        }
    }
}
