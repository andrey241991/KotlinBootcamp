package lesson2

class Variables {


    fun fishCount(){
        2.plus(71).plus(233).minus(13).div(30).plus(1)
    }

    fun rainbowColor(){
        var rainbowColor = "red"
        rainbowColor = "blue"
        val blackColor = "black"
      //  blackColor = "white"    error

        var greenColor = null
        var blueColor: Int? = null
    }

    fun listToNull(){
        listOf(null,null)
        var list: List<Int?> = listOf(null, null)
        var list2:List<Int>? = null
    }


}