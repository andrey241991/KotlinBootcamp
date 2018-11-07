package lesson4

import java.awt.Color

data class SpiceContainer(var spice: Spice) {
    val label = spice.name

}


fun spiceCabinet(){
    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
            SpiceContainer(Curry("Red Curry", "medium")),
            SpiceContainer(Curry("Green Curry", "spicy")))

    for(element in spiceCabinet) println(element.label)

}

interface SpiceColor2 {
    val color: Color
}

object YellowSpiceColor2 : SpiceColor2 {
    override val color = Color.YELLOW
}

