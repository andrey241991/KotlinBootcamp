package lesson4


abstract class AbstractSpice (val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String,
            color: SpiceColor = YellowSpiceColor) : AbstractSpice(name, spiciness, color), Grinder {
    override fun grind() {
    }

    override fun prepareSpice() {
        grind()
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color = "Yellow"
}

