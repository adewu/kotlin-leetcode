package a

abstract class Coffee(val additives: ICoffeeAdditives) {
    abstract fun orderCoffee(count : Int)
}