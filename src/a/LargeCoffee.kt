package a

class LargeCoffee(additives: ICoffeeAdditives) : RefinedCoffee(additives) {
    override fun orderCoffee(count: Int) {
        additives.addSomething()
        print("large"+count+"杯")
    }
}