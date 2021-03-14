package contest

class B {

    /**
     *
     * 1 base + (0 , 1, 2 single topping[0]) + (0,1,2  single topping[1]) +(0 ,1,2 single topping[2])  < 18
     */

    fun closestCost(baseCosts: IntArray, toppingCosts: IntArray, target: Int): Int {
        var res = 0
        baseCosts.forEachIndexed { _, i ->
            val r = target - i
            toppingCosts.forEachIndexed { index, j ->
                
            }
        }

        return res
    }

    fun exe(){
        closestCost(intArrayOf(2,3), intArrayOf(4,5,100),18)
    }
}