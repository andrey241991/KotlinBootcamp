package lesson2

class Loops {

    fun showLoop(){
        var list3 : MutableList<Int> = mutableListOf()
        for (i in 0..100 step 7) list3.add(i)
        print(list3)
    }
}