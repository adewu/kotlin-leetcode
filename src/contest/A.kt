package contest

class A {


    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        var res = 0
        val keyArr = arrayOf("type","color","name")
        val index = keyArr.indexOf(ruleKey)
        if (index in 0 .. 2){
            items.forEachIndexed { _, list ->
                if (list[index] == ruleValue){
                    res += 1
                }
            }
        }

        return res
    }


    fun exe(){
        countMatches(listOf(listOf("phone","blue","pixel"), listOf("computer","silver","phone"), listOf("phone","gold","iphone")),"type","phone")
    }

}