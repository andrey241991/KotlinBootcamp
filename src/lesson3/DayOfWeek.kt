package lesson3

import java.util.*

class DayOfWeek {

    val rollDice = { sides: Int ->
        Random().nextInt(sides) + 1
    }
    val rollDice0 = { sides: Int ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0
        else Random().nextInt(sides) + 1
    }

    fun dayOfWeek() {
        println("What day is it today?")
        val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
        println( when (day) {
            1 -> "Sunday"
            2 -> "Monday"
            3 -> "Tuesday"
            4 -> "Wednesday"
            5 -> "Thursday"
            6 -> "Friday"
            7 -> "Saturday"
            else -> "Time has stopped"
        })
    }

    fun getFortune() : String {
        val fortunes = listOf( "You will have a great day!",
                "Things will go well for you today.",
                "Enjoy a wonderful day of success.",
                "Be humble and all will turn out well.",
                "Today is a good day for exercising restraint.",
                "Take it easy and enjoy life!",
                "Treasure your friends, because they are your greatest fortune.")
        print("\nEnter your birthday: ")
        val birthday = readLine()?.toIntOrNull() ?: 1
        return fortunes[birthday.rem(fortunes.size)]
    }




        fun isVeryHot (temperature: Int) = temperature > 35
        fun isSadRainyCold (mood: String, weather: String, temperature: Int) =
                mood == "sad" && weather == "rainy" && temperature == 0
        fun isHappySunny (mood: String, weather: String) = mood == "happy" && weather == "sunny"
        fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
            return when {
                isVeryHot(temperature) -> "go swimming"
                isSadRainyCold(mood, weather, temperature) -> "stay in bed"
                isHappySunny(mood, weather) -> "go for a walk"
                else -> "Stay home and read."
            }
        }


}


fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
    return when {
        mood == "happy" && weather == "Sunny" -> "go for a walk"
        else -> "Stay home and read."
    }
}

