package a

import kotlin.random.Random

abstract class RefinedCoffee(additives: ICoffeeAdditives) : Coffee(additives) {

    fun checkQuality(){
        val ran = java.util.Random()
        print(String.format("%s add%s",additives.javaClass.simpleName,if (ran.nextBoolean()) "太多" else "正常"))
    }
}